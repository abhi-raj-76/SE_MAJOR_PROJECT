import html
import json
import logging
import os
import traceback
from pathlib import Path
from typing import Optional

from fastapi.staticfiles import StaticFiles

import joblib
import pandas as pd
from fastapi import FastAPI, File, Form, UploadFile
from fastapi.responses import HTMLResponse




from defect_analyzer import (
    BUILD_DIR,
    classify_density,
    classify_binary_defect,
    classify_error_types,
    compile_source,
    extract_class_name,
    extract_fqn_class_name,
    extract_static_metrics,
    is_interactive_program,
    run_source,
)
from defect_rules import DEFECT_LABELS, detect_potential_defects

BASE_DIR = Path(__file__).resolve().parent

MODEL_DIR = "model_artifacts"
MODEL_PATH = str(BASE_DIR / MODEL_DIR / "defect_model_bundle.joblib")
METRICS_PATH = str(BASE_DIR / MODEL_DIR / "model_metrics.json")
INPUT_DIR = "prediction_inputs"

logger = logging.getLogger(__name__)

app = FastAPI(title="Java Defect Predictor")

app.mount(
    "/static",
    StaticFiles(directory=BASE_DIR),
    name="static"
)


def ensure_dirs():
    (BASE_DIR / INPUT_DIR).mkdir(parents=True, exist_ok=True)
    (BASE_DIR / BUILD_DIR / "classes").mkdir(parents=True, exist_ok=True)
    (BASE_DIR / BUILD_DIR / "test-classes").mkdir(parents=True, exist_ok=True)


def load_model_bundle():
    if not os.path.exists(MODEL_PATH) or not os.path.exists(METRICS_PATH):
        return None, None

    try:
        model = joblib.load(MODEL_PATH)
    except Exception:
        logger.exception("Failed to load joblib model from %s", MODEL_PATH)
        raise
    with open(METRICS_PATH, "r", encoding="utf-8") as f:
        metrics = json.load(f)
    return model, metrics


def save_input_code(class_name, code):
    safe_name = class_name or "UserSubmission"
    file_path = BASE_DIR / INPUT_DIR / f"{safe_name}.java"
    file_path.parent.mkdir(parents=True, exist_ok=True)
    file_path.write_text(code, encoding="utf-8")
    return str(file_path)


def build_feature_row(code):
    class_name = extract_class_name(code, "UserSubmission")
    binary_class_name = extract_fqn_class_name(code, class_name)
    metrics = extract_static_metrics(code)
    interactive = is_interactive_program(code)
    source_path = save_input_code(class_name, code)

    src_ok, src_err, src_warn, src_out = compile_source(source_path)

    runtime_attempted = metrics["has_main_method"] and src_ok and not interactive
    runtime_errors = 0
    exception_types = []
    runtime_out = ""
    if runtime_attempted:
        runtime_errors, exception_types, runtime_out = run_source(binary_class_name)

    total_defects = src_err + runtime_errors
    density = round((total_defects / max(metrics["loc"], 1)) * 1000, 2)
    potential_defects = detect_potential_defects(code)

    row = {
        "file": os.path.basename(source_path),
        "class_name": class_name,
        "source_origin": "user",
        "source_topic": "user_submission",
        **metrics,
        "is_interactive_program": interactive,
        "src_compiled": src_ok,
        "src_compile_errors": src_err,
        "src_warnings": src_warn,
        "runtime_attempted": runtime_attempted,
        "runtime_errors": runtime_errors,
        "exception_types": ", ".join(exception_types),
        "test_exists": False,
        "test_compiled": False,
        "test_compile_errors": 0,
        "test_warnings": 0,
        "tests_passed": 0,
        "tests_failed": 0,
        "tests_total": 0,
        "test_status": "not_provided",
        "total_defects": total_defects,
        "defect_density": density,
        "density_grade": classify_density(density),
        "is_defective": classify_binary_defect(total_defects),
        "defect_types": classify_error_types(src_err, runtime_errors, 0, 0),
        "potential_defects": potential_defects,
        "src_compile_out": (src_out or "")[:1200],
        "runtime_out": (runtime_out or "")[:1200],
    }
    return row


def make_prediction(row, model_bundle, model_metrics):
    if isinstance(model_bundle, dict):
        target_feature_map = model_bundle.get("features", {})
        fallback_features = model_metrics.get("features", [])
        overall_feature_names = target_feature_map.get("is_defective", fallback_features)
        overall_pipeline = model_bundle["targets"]["is_defective"]["pipeline"]
    else:
        target_feature_map = {}
        overall_feature_names = model_metrics.get("features", [])
        overall_pipeline = model_bundle

    overall_feature_frame = pd.DataFrame([row]).reindex(columns=overall_feature_names)
    predicted_label = int(overall_pipeline.predict(overall_feature_frame)[0])
    probability = None
    if hasattr(overall_pipeline, "predict_proba"):
        probabilities = overall_pipeline.predict_proba(overall_feature_frame)
        if getattr(probabilities, "shape", (0, 0))[1] >= 2:
            probability = float(probabilities[0][1])
        elif getattr(probabilities, "shape", (0, 0))[1] == 1:
            probability = float(probabilities[0][0])

    defect_type_predictions = []
    if isinstance(model_bundle, dict):
        for defect_label in DEFECT_LABELS:
            target_model_info = model_bundle["targets"].get(defect_label)
            if not target_model_info:
                continue
            pipeline = target_model_info["pipeline"]
            target_feature_names = target_feature_map.get(defect_label, overall_feature_names)
            target_feature_frame = pd.DataFrame([row]).reindex(columns=target_feature_names)
            predicted = int(pipeline.predict(target_feature_frame)[0])
            predicted_probability = None
            if hasattr(pipeline, "predict_proba"):
                probabilities = pipeline.predict_proba(target_feature_frame)
                if getattr(probabilities, "shape", (0, 0))[1] >= 2:
                    predicted_probability = float(probabilities[0][1])
                elif getattr(probabilities, "shape", (0, 0))[1] == 1:
                    predicted_probability = float(probabilities[0][0])
            defect_type_predictions.append(
                {
                    "label": defect_label,
                    "predicted": predicted,
                    "probability": predicted_probability,
                    "model_name": target_model_info.get("best_model_name", ""),
                }
            )

    return predicted_label, probability, defect_type_predictions


def render_page(result=None, error_message=""):
    result_html = ""
    if result:
        label_to_text = {
            "has_unchecked_division": "Possible unchecked division (zero-division risk)",
            "has_array_bounds_risk": "Possible array index out-of-bounds risk",
            "has_null_handling_risk": "Weak null-handling pattern detected",
            "has_possible_null_dereference": "Possible null dereference",
            "has_swallowed_exception": "Exception may be swallowed/ignored",
            "has_resource_leak_risk": "Possible resource leak (missing close/cleanup)",
            "has_infinite_loop_risk": "Possible infinite loop pattern",
            "has_unbounded_recursion_risk": "Possible unbounded recursion",
            "has_missing_input_validation": "Possible missing input validation",
        }

        predicted_items = [
            item
            for item in result.get("ml_defect_predictions", [])
            if int(item.get("predicted", 0)) == 1
        ]

        potential_items = ""
        for item in predicted_items:
            readable_label = label_to_text.get(item["label"], item["label"].replace("_", " "))
            confidence = (
                f"{float(item['probability']):.2%}"
                if item.get("probability") is not None
                else "N/A"
            )
            potential_items += (
                f"<li><strong>{readable_label}</strong> "
                f"(confidence: {confidence}, model: {item['model_name']})</li>"
            )
        potential_html = (
            f"<ul>{potential_items}</ul>"
            if potential_items
            else "<p>No specific defect type was predicted for this code.</p>"
        )
        probability_html = ""
        prob = result.get("probability")
        if prob is not None:
            try:
                probability_html = (
                    f"<p><strong>Predicted defect probability:</strong> {float(prob):.2%}</p>"
                )
            except (TypeError, ValueError):
                probability_html = "<p><strong>Predicted defect probability:</strong> N/A</p>"
        result_html = f"""
        <section class="card result-card">
          <h2>Prediction</h2>
          <p><strong>Class:</strong> {html.escape(str(result.get('class_name', '')))}</p>
          <p><strong>Defect predicted:</strong> {"Yes" if result['predicted_label'] == 1 else "No"}</p>
          {probability_html}
          <p><strong>Compile status:</strong> {"Compiled" if result['src_compiled'] else "Compile failed"}</p>
          <p><strong>Density grade:</strong> {html.escape(str(result.get('density_grade', '')))}</p>
          <p><strong>Observed defects counted now:</strong> {result['total_defects']}</p>
          <p><strong>Defect density:</strong> {result['defect_density']} defects/KLOC</p>
        </section>
        <section class="card">
          <h2>ML Defect-Type Predictions</h2>
          {potential_html}
        </section>
        <section class="card">
          <h2>Code Info</h2>
          <div class="grid">
            <div><strong>LOC</strong><span>{result['loc']}</span></div>
            <div><strong>Total lines</strong><span>{result['total_lines']}</span></div>
            <div><strong>Methods</strong><span>{result['method_count']}</span></div>
            <div><strong>Classes</strong><span>{result['class_count']}</span></div>
            <div><strong>Fields</strong><span>{result['field_count']}</span></div>
            <div><strong>Imports</strong><span>{result['import_count']}</span></div>
            <div><strong>If count</strong><span>{result['if_count']}</span></div>
            <div><strong>Loop count</strong><span>{result['loop_count']}</span></div>
            <div><strong>Catch count</strong><span>{result['catch_count']}</span></div>
            <div><strong>Max nesting depth</strong><span>{result['max_nesting_depth']}</span></div>
            <div><strong>Cyclomatic estimate</strong><span>{result['cyclomatic_estimate']}</span></div>
            <div><strong>Interactive</strong><span>{result['is_interactive_program']}</span></div>
          </div>
        </section>
        <section class="card">
          <h2>Compiler Output</h2>
          <pre>{html.escape(str(result.get('src_compile_out') or 'No compiler output'))}</pre>
        </section>
        <section class="card">
          <h2>Runtime Output</h2>
          <pre>{html.escape(str(result.get('runtime_out') or 'Runtime skipped or no output'))}</pre>
        </section>
        """

    error_html = ""
    if error_message:
        error_html = (
            '<section class="card error">'
            f'<pre style="white-space:pre-wrap;font-family:Consolas,monospace;font-size:0.9rem;margin:0">'
            f"{html.escape(error_message)}</pre></section>"
        )

    return f"""
    <!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="utf-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1" />
      <title>Java Defect Predictor</title>

      <link
        rel="icon"
        type="image/png"
        href="/static/image.png"
      />
      <style>
        :root {{
          --bg: #f4efe6;
          --ink: #132a2a;
          --accent: #b85c38;
          --accent-dark: #7a2f18;
          --card: #fff9f1;
          --line: #dfcfbb;
        }}
        * {{ box-sizing: border-box; }}
        body {{
          margin: 0;
          font-family: Georgia, "Times New Roman", serif;
          color: var(--ink);
          background:
            radial-gradient(circle at top left, rgba(184,92,56,.18), transparent 35%),
            linear-gradient(180deg, #fbf6ee 0%, var(--bg) 100%);
        }}
        .wrap {{
          width: min(1080px, calc(100% - 32px));
          margin: 32px auto 64px;
        }}
        .hero {{
          padding: 28px;
          border: 1px solid var(--line);
          background: linear-gradient(135deg, rgba(255,249,241,.95), rgba(247,235,220,.92));
          border-radius: 20px;
          box-shadow: 0 18px 60px rgba(19,42,42,.08);
        }}
        h1 {{
          margin: 0 0 10px;
          font-size: clamp(2rem, 4vw, 3.2rem);
          line-height: 1;
        }}
        .sub {{
          max-width: 760px;
          font-size: 1.02rem;
        }}
        .card {{
          margin-top: 22px;
          padding: 22px;
          border-radius: 18px;
          border: 1px solid var(--line);
          background: var(--card);
          box-shadow: 0 16px 40px rgba(19,42,42,.06);
        }}
        .error {{
          color: #7a1f1f;
          background: #fff1ef;
          border-color: #e3b6b1;
        }}
        textarea {{
          width: 100%;
          min-height: 320px;
          padding: 16px;
          border-radius: 14px;
          border: 1px solid var(--line);
          background: #fffdf9;
          font-family: Consolas, monospace;
          font-size: .95rem;
        }}
        .actions {{
          display: flex;
          gap: 12px;
          align-items: center;
          flex-wrap: wrap;
          margin-top: 16px;
        }}
        button {{
          border: 0;
          background: linear-gradient(135deg, var(--accent), var(--accent-dark));
          color: white;
          padding: 12px 18px;
          border-radius: 999px;
          font-weight: 700;
          cursor: pointer;
        }}
        input[type=file] {{
          max-width: 100%;
        }}
        .grid {{
          display: grid;
          grid-template-columns: repeat(auto-fit, minmax(160px, 1fr));
          gap: 12px;
        }}
        .grid div {{
          padding: 12px;
          border-radius: 14px;
          background: #fffdf8;
          border: 1px solid var(--line);
          display: flex;
          flex-direction: column;
          gap: 4px;
        }}
        pre {{
          white-space: pre-wrap;
          word-break: break-word;
          background: #fffdf8;
          border: 1px solid var(--line);
          border-radius: 14px;
          padding: 14px;
          overflow: auto;
        }}
      </style>
    </head>
    <body>
      <main class="wrap">
        <section class="hero">
          <h1>Java Defect Predictor</h1>
          <p class="sub">Paste Java code or upload a <code>.java</code> file to get a defect prediction, compile feedback, and structural metrics derived from your defect-analysis pipeline.</p>
        </section>
        {error_html}
        <section class="card">
          <h2>Submit Code</h2>
          <form action="/analyze" method="post" enctype="multipart/form-data">
            <label for="code"><strong>Paste Java code</strong></label>
            <textarea id="code" name="code" placeholder="public class Demo {{ ... }}"></textarea>
            <div class="actions">
              <input type="file" name="file" accept=".java,text/plain" />
              <button type="submit">Analyze Code</button>
            </div>
          </form>
        </section>
        {result_html}
      </main>
    </body>
    </html>
    """


@app.get("/", response_class=HTMLResponse)
def home():
    return render_page()


@app.post("/analyze", response_class=HTMLResponse)
async def analyze(code: str = Form(""), file: Optional[UploadFile] = File(default=None)):
    ensure_dirs()
    try:
        model_bundle, model_metrics = load_model_bundle()
    except Exception:
        logger.exception("Model load failed")
        detail = traceback.format_exc()
        return render_page(
            error_message=(
                "Could not load the saved model (defect_model_bundle.joblib). "
                "This is usually a scikit-learn / numpy version mismatch with the machine "
                "that trained the bundle.\n\n"
                "Fix: from your venv, run: pip install -r ../requirements.txt "
                "(use the pinned versions from the repo), then restart uvicorn.\n\n"
                f"Technical detail:\n{detail}"
            )
        )

    if model_bundle is None or model_metrics is None:
        return render_page(
            error_message=(
                "Model artifacts are missing under agents/model_artifacts/. "
                "Ensure defect_model_bundle.joblib and model_metrics.json are committed "
                "and were cloned (not skipped by Git LFS or a sparse checkout)."
            )
        )

    submitted_code = code.strip()
    if file is not None and file.filename:
        uploaded_content = await file.read()
        submitted_code = uploaded_content.decode("utf-8", errors="ignore").strip()

    if not submitted_code:
        return render_page(error_message="Please paste Java code or upload a .java file.")

    try:
        result = build_feature_row(submitted_code)
        predicted_label, probability, defect_type_predictions = make_prediction(
            result, model_bundle, model_metrics
        )
        result["predicted_label"] = predicted_label
        result["probability"] = probability
        result["ml_defect_predictions"] = defect_type_predictions
        return render_page(result=result)
    except Exception:
        logger.exception("Analyze request failed")
        detail = traceback.format_exc()
        return render_page(
            error_message=(
                "Something went wrong while analyzing your submission. "
                "See the traceback below. Common causes: incompatible ML library versions, "
                "or an unexpected value from the Java toolchain.\n\n"
                f"{detail}"
            )
        )
