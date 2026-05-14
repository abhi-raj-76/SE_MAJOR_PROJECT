"""
Defect Density Calculator — Full Pipeline
==========================================
Combines:
  1. Source file compile errors     (javac java_samples/)
  2. Source file runtime errors     (java java_samples/)
  3. Test file compile errors       (javac test_samples/)
  4. JUnit test PASS / FAIL count   (junit-standalone JAR)

Defect Density = (compile_errors + runtime_errors + test_failures) / LOC * 1000

Output:
  - Console summary per file
  - defect_report.json
  - defect_report.csv

Requirements:
  - JDK installed  (javac + java in PATH)
  - JUnit JAR auto-downloaded on first run
"""

import os
import re
import shutil
import subprocess
import csv
import random
import urllib.request
import json
import signal
import multiprocessing
from datetime import datetime
from defect_rules import DEFECT_LABELS, build_defect_label_columns

SOURCE_DIR  = "java_samples"
TEST_DIR    = "test_samples"
REPORT_CSV  = "defect_report.csv"
DATASET_CSV = "defect_dataset.csv"
TRAIN_CSV   = "defect_dataset_train.csv"
TEST_CSV    = "defect_dataset_test.csv"
BUILD_DIR   = "build"
# Paths for javac/java must not depend on the process cwd (uvicorn may start elsewhere).
_AGENT_ROOT = os.path.dirname(os.path.abspath(__file__))
MANIFEST_CSV = "sample_manifest.csv"
TRAIN_RATIO = 0.8
RANDOM_SEED = 42
PROGRESS_FILE = "defect_analyzer_progress.json"
SKIPPED_FILE = "defect_analyzer_skipped.csv"
COMPILE_TIMEOUT_SEC = 30
RUN_TIMEOUT_SEC = 15
TEST_COMPILE_TIMEOUT_SEC = 30
JUNIT_TIMEOUT_SEC = 30
PER_FILE_TIMEOUT_SEC = 90

JUNIT_JAR_URL = (
    "https://repo1.maven.org/maven2/org/junit/platform/"
    "junit-platform-console-standalone/1.10.0/"
    "junit-platform-console-standalone-1.10.0-all.jar"
)
JUNIT_JAR = os.path.join(_AGENT_ROOT, BUILD_DIR, "junit-standalone.jar")


def setup():
    os.makedirs(os.path.join(_AGENT_ROOT, BUILD_DIR, "classes"), exist_ok=True)
    os.makedirs(os.path.join(_AGENT_ROOT, BUILD_DIR, "test-classes"), exist_ok=True)

    if not os.path.exists(JUNIT_JAR):
        print("  Downloading JUnit standalone runner (~8MB)...")
        try:
            urllib.request.urlretrieve(JUNIT_JAR_URL, JUNIT_JAR)
            print("  JUnit JAR downloaded\n")
        except Exception as e:
            print(f"  Failed to download JUnit JAR: {e}")
            print(f"  Download manually: {JUNIT_JAR_URL}")
            print(f"  Save to: {JUNIT_JAR}\n")


def load_manifest():
    if os.path.exists(MANIFEST_CSV):
        with open(MANIFEST_CSV, "r", encoding="utf-8", newline="") as f:
            reader = csv.DictReader(f)
            return {row["file"]: row for row in reader}

    return {}


def count_loc(code):
    loc = 0
    for line in code.splitlines():
        s = line.strip()
        if s and not s.startswith("//") and not s.startswith("*"):
            loc += 1
    return max(loc, 1)


def extract_class_name(code, fallback="Unknown"):
    match = re.search(r'public\s+class\s+(\w+)', code)
    return match.group(1) if match else fallback


def extract_fqn_class_name(code, fallback="Unknown"):
    """Simple name or fully qualified name for java -cp ... <main class>."""
    pkg_m = re.search(r"^\s*package\s+([\w.]+)\s*;", code, re.MULTILINE)
    cls_m = re.search(r"public\s+class\s+(\w+)", code)
    simple = cls_m.group(1) if cls_m else fallback
    if pkg_m:
        return f"{pkg_m.group(1)}.{simple}"
    return simple


def count_pattern(code, pattern):
    return len(re.findall(pattern, code, flags=re.MULTILINE))


def avg_method_length(code):
    method_positions = list(re.finditer(
        r"(public|private|protected)\s+(?:static\s+)?[\w<>\[\]]+\s+\w+\s*\([^)]*\)\s*\{",
        code,
    ))
    if not method_positions:
        return 0.0

    lengths = []
    for match in method_positions:
        start = match.end() - 1
        depth = 0
        end = start
        for idx in range(start, len(code)):
            char = code[idx]
            if char == "{":
                depth += 1
            elif char == "}":
                depth -= 1
                if depth == 0:
                    end = idx
                    break
        method_body = code[start:end + 1]
        lengths.append(max(count_loc(method_body), 1))

    return round(sum(lengths) / len(lengths), 2)


def max_brace_depth(code):
    depth = 0
    max_depth = 0
    for char in code:
        if char == "{":
            depth += 1
            max_depth = max(max_depth, depth)
        elif char == "}":
            depth = max(depth - 1, 0)
    return max_depth


def extract_static_metrics(code):
    total_lines = len(code.splitlines())
    blank_lines = sum(1 for line in code.splitlines() if not line.strip())
    comment_lines = sum(
        1 for line in code.splitlines()
        if line.strip().startswith("//") or line.strip().startswith("*")
    )
    loc = count_loc(code)
    method_count = count_pattern(
        code,
        r"(public|private|protected)\s+(?:static\s+)?[\w<>\[\]]+\s+\w+\s*\([^)]*\)\s*\{",
    )
    class_count = count_pattern(code, r"\b(class|interface|enum)\s+\w+")
    field_count = count_pattern(
        code,
        r"^\s*(private|public|protected)\s+(?!class\b|interface\b|enum\b)(?!static\s+final\b)[\w<>\[\]]+\s+\w+\s*(=.*)?;",
    )
    import_count = count_pattern(code, r"^\s*import\s+")
    if_count = count_pattern(code, r"\bif\s*\(")
    loop_count = count_pattern(code, r"\b(for|while|do)\b")
    switch_count = count_pattern(code, r"\bswitch\s*\(")
    catch_count = count_pattern(code, r"\bcatch\s*\(")
    throw_count = count_pattern(code, r"\bthrow\b")
    return_count = count_pattern(code, r"\breturn\b")
    public_method_count = count_pattern(
        code, r"public\s+(?:static\s+)?[\w<>\[\]]+\s+\w+\s*\([^)]*\)\s*\{"
    )
    static_method_count = count_pattern(
        code, r"(public|private|protected)\s+static\s+[\w<>\[\]]+\s+\w+\s*\([^)]*\)\s*\{"
    )
    has_main = bool(re.search(r"public\s+static\s+void\s+main\s*\(\s*String", code))
    cyclomatic = (
        1
        + if_count
        + loop_count
        + switch_count
        + count_pattern(code, r"\bcase\b")
        + count_pattern(code, r"\bcatch\b")
        + count_pattern(code, r"&&|\|\|")
    )

    return {
        "total_lines": total_lines,
        "blank_lines": blank_lines,
        "comment_lines": comment_lines,
        "loc": loc,
        "class_count": class_count,
        "method_count": method_count,
        "field_count": field_count,
        "import_count": import_count,
        "if_count": if_count,
        "loop_count": loop_count,
        "switch_count": switch_count,
        "catch_count": catch_count,
        "throw_count": throw_count,
        "return_count": return_count,
        "public_method_count": public_method_count,
        "static_method_count": static_method_count,
        "has_main_method": has_main,
        "max_nesting_depth": max_brace_depth(code),
        "cyclomatic_estimate": cyclomatic,
        "avg_method_loc": avg_method_length(code),
        "comment_ratio": round(comment_lines / max(total_lines, 1), 4),
    }


def is_interactive_program(code):
    return bool(
        re.search(r"\bScanner\b", code) or re.search(r"System\.in", code)
    )


def run_cmd(cmd, timeout=30):
    try:
        r = subprocess.run(cmd, capture_output=True, text=True, timeout=timeout)
        return r.returncode, r.stdout, r.stderr
    except subprocess.TimeoutExpired:
        return -1, "", "Timed out"
    except FileNotFoundError as e:
        return -1, "", str(e)
    except Exception as e:
        return -1, "", f"Unexpected error: {str(e)}"


def compile_source(filepath):
    if not shutil.which("javac"):
        return (
            False,
            0,
            0,
            "javac was not found on PATH. Install a JDK (not only a JRE) and add "
            "its bin directory (for example ...\\jdk-17\\bin) to your PATH, then restart the terminal.",
        )
    filepath = os.path.normpath(os.path.abspath(filepath))
    out_dir = os.path.join(_AGENT_ROOT, BUILD_DIR, "classes")
    os.makedirs(out_dir, exist_ok=True)
    rc, stdout, stderr = run_cmd(
        ["javac", "-d", out_dir, filepath],
        timeout=COMPILE_TIMEOUT_SEC
    )
    output   = stderr + stdout
    errors   = len(re.findall(r'\berror:', output))
    warnings = len(re.findall(r'\bwarning:', output))
    return rc == 0, errors, warnings, output


def run_source(binary_class_name):
    """binary_class_name is the JVM class name (e.g. com.app.Demo or Demo)."""
    classes_dir = os.path.join(_AGENT_ROOT, BUILD_DIR, "classes")
    rc, stdout, stderr = run_cmd(
        ["java", "-cp", classes_dir, binary_class_name], timeout=RUN_TIMEOUT_SEC
    )
    output = stderr + stdout
    uncaught_events = re.findall(
        r'^Exception in thread "[^"]+"\s+([\w.$]+)',
        output,
        flags=re.MULTILINE,
    )
    if uncaught_events:
        ex_types = sorted(set(uncaught_events))
        return len(uncaught_events), ex_types, output

    fallback_types = re.findall(
        r'\b(java\.[\w.$]+(?:Exception|Error))\b',
        output,
        flags=re.MULTILINE,
    )
    ex_types = sorted(set(fallback_types))
    return len(ex_types), ex_types, output


def compile_test(test_filepath):
    if not os.path.isabs(test_filepath):
        test_filepath = os.path.normpath(os.path.join(_AGENT_ROOT, test_filepath))
    if not os.path.exists(test_filepath):
        return False, 0, 0, "No test file"

    src_cp    = os.path.join(_AGENT_ROOT, BUILD_DIR, "classes")
    test_out  = os.path.join(_AGENT_ROOT, BUILD_DIR, "test-classes")
    classpath = f"{src_cp}{os.pathsep}{JUNIT_JAR}"

    rc, stdout, stderr = run_cmd(
        ["javac", "-cp", classpath, "-d", test_out, test_filepath],
        timeout=TEST_COMPILE_TIMEOUT_SEC
    )
    output   = stderr + stdout
    errors   = len(re.findall(r'\berror:', output))
    warnings = len(re.findall(r'\bwarning:', output))
    return rc == 0, errors, warnings, output

def run_tests(test_class_name):
    if not os.path.exists(JUNIT_JAR):
        return 0, 0, 0, "JUnit JAR missing"

    src_cp    = os.path.join(_AGENT_ROOT, BUILD_DIR, "classes")
    test_cp   = os.path.join(_AGENT_ROOT, BUILD_DIR, "test-classes")
    classpath = f"{src_cp}{os.pathsep}{test_cp}{os.pathsep}{JUNIT_JAR}"

    rc, stdout, stderr = run_cmd([
        "java", "-jar", JUNIT_JAR,
        "--class-path", classpath,
        "--select-class", test_class_name,
        "--details", "summary"
    ], timeout=JUNIT_TIMEOUT_SEC)

    output = stdout + stderr

    passed = 0
    failed = 0
    # Match format: [        10 tests successful      ]
    m = re.search(r'\[\s*(\d+)\s+tests\s+successful\s*\]', output)
    if m:
        passed = int(m.group(1))
    m = re.search(r'\[\s*(\d+)\s+tests\s+failed\s*\]', output)
    if m:
        failed = int(m.group(1))

    if passed == 0 and failed == 0:
        # Fallback: count lines mentioning tests
        passed = len(re.findall(r'tests\s+successful', output))
        failed = len(re.findall(r'tests\s+failed', output))

    return passed, failed, passed + failed, output


def classify_density(d):
    """
    Research-informed heuristic based on:
    Shah, Morisio, and Torchiano, "An Overview of Software Defect Density:
    A Scoping Study" (APSEC 2012, DOI: 10.1109/APSEC.2012.93).

    The paper reports, across 109 projects:
    - median defect density: 4.3 defects/KLOC
    - mean defect density: 7.47 defects/KLOC
    - standard deviation: 7.99 defects/KLOC

    The paper does not define universal categorical thresholds, so the
    thresholds below are an inference built from its reported central
    tendency values:
    - Clean: exactly 0
    - Low: below the reported median
    - Medium: from median up to the reported mean
    - High: above the reported mean
    """
    if d == 0:
        return "Clean"
    elif d < 4.3:
        return "Low"
    elif d <= 7.47:
        return "Medium"
    else:
        return "High"


def classify_binary_defect(total_defects):
    return 1 if total_defects > 0 else 0


def classify_error_types(src_err, runtime_err, test_err, failed_tests):
    defect_types = []
    if src_err > 0:
        defect_types.append("source_compile")
    if runtime_err > 0:
        defect_types.append("runtime")
    if test_err > 0:
        defect_types.append("test_compile")
    if failed_tests > 0:
        defect_types.append("test_failure")
    return ",".join(defect_types) if defect_types else "none"


def infer_origin(filename, manifest_row):
    if manifest_row:
        origin = manifest_row.get("source_origin", "").strip().lower()
        if origin:
            return origin

    if filename.lower().startswith("sample_"):
        return "llm"
    return "unknown"


def determine_test_status(test_exists, test_compiled, tests_total, junit_output):
    if not test_exists:
        return "no_test_file"
    if not test_compiled:
        return "test_compile_failed"
    if tests_total == 0:
        if "JUnit JAR missing" in junit_output:
            return "junit_missing"
        return "no_tests_detected"
    return "tests_executed"


def analyze_file(source_path, manifest_map):
    filename = os.path.basename(source_path)
    
    try:
        with open(source_path, "r", encoding="utf-8", errors="ignore") as f:
            code = f.read()
    except Exception as e:
        return create_error_result(filename, f"Failed to read file: {str(e)}")
    
    try:
        class_name = extract_class_name(code, os.path.splitext(filename)[0])
        binary_class_name = extract_fqn_class_name(code, class_name)
        metrics    = extract_static_metrics(code)
        interactive_program = is_interactive_program(code)
        defect_label_columns = build_defect_label_columns(code)
        manifest_row = manifest_map.get(filename, {})
        source_origin = infer_origin(filename, manifest_row)
        source_topic = manifest_row.get("source_topic", "")

        # 1. Compile source
        src_ok, src_err, src_warn, src_out = compile_source(source_path)
        if "Timed out" in src_out:
            return create_error_result(
                filename,
                f"Timed out during source compile ({COMPILE_TIMEOUT_SEC}s)",
                defect_type="source_compile",
            )

        # 2. Run source
        rt_count, ex_types, run_out = (0, [], "")
        runtime_attempted = metrics["has_main_method"] and src_ok and not interactive_program
        if runtime_attempted:
            rt_count, ex_types, run_out = run_source(binary_class_name)
            if "Timed out" in run_out:
                return create_error_result(
                    filename,
                    f"Timed out during source run ({RUN_TIMEOUT_SEC}s)",
                    defect_type="runtime",
                )

        # 3. Compile test
        test_path = os.path.join(_AGENT_ROOT, TEST_DIR, f"{class_name}Test.java")
        test_exists = os.path.exists(test_path)
        t_ok, t_err, t_warn, t_out = compile_test(test_path)
        if "Timed out" in t_out:
            return create_error_result(
                filename,
                f"Timed out during test compile ({TEST_COMPILE_TIMEOUT_SEC}s)",
                defect_type="test_compile",
            )

        # 4. Run JUnit
        passed, failed, total_tests, junit_out = (0, 0, 0, "")
        if test_exists and t_ok:
            passed, failed, total_tests, junit_out = run_tests(f"{class_name}Test")
            if "Timed out" in junit_out:
                return create_error_result(
                    filename,
                    f"Timed out during JUnit run ({JUNIT_TIMEOUT_SEC}s)",
                    defect_type="test_failure",
                )

        test_status = determine_test_status(test_exists, t_ok, total_tests, junit_out)

        # Defect density
        total_defects  = src_err + rt_count + t_err + failed
        density        = round((total_defects / metrics["loc"]) * 1000, 2)
        density_grade  = classify_density(density)
        is_defective   = classify_binary_defect(total_defects)
        defect_types   = classify_error_types(src_err, rt_count, t_err, failed)

        return {
            "file":                filename,
            "class_name":          class_name,
            "source_origin":       source_origin,
            "source_topic":        source_topic,
            **metrics,
            **defect_label_columns,
            "is_interactive_program": interactive_program,

            "src_compiled":        src_ok,
            "src_compile_errors":  src_err,
            "src_warnings":        src_warn,
            "runtime_attempted":   runtime_attempted,
            "runtime_errors":      rt_count,
            "exception_types":     ex_types,

            "test_exists":         test_exists,
            "test_compiled":       t_ok,
            "test_compile_errors": t_err,
            "test_warnings":       t_warn,
            "tests_passed":        passed,
            "tests_failed":        failed,
            "tests_total":         total_tests,
            "test_status":         test_status,

            "total_defects":       total_defects,
            "defect_density":      density,
            "density_grade":       density_grade,
            "is_defective":        is_defective,
            "defect_types":        defect_types,

            # raw outputs for debugging
            "src_compile_out":     src_out[:400],
            "runtime_out":         run_out[:400],
            "test_compile_out":    t_out[:400],
            "junit_out":           junit_out[:400],
        }
    except Exception as e:
        return create_error_result(filename, f"Analysis failed: {str(e)}")


def _analyze_worker(source_path, manifest_map, queue):
    try:
        queue.put(("ok", analyze_file(source_path, manifest_map)))
    except Exception as e:
        queue.put(("error", str(e)))


def analyze_file_with_timeout(source_path, manifest_map, timeout_sec=PER_FILE_TIMEOUT_SEC):
    queue = multiprocessing.Queue()
    process = multiprocessing.Process(
        target=_analyze_worker,
        args=(source_path, manifest_map, queue),
    )
    process.start()
    process.join(timeout_sec)

    if process.is_alive():
        process.terminate()
        process.join()
        filename = os.path.basename(source_path)
        reason = f"Timed out: file analysis exceeded {timeout_sec}s"
        return create_error_result(filename, reason, defect_type="runtime"), reason

    if queue.empty():
        filename = os.path.basename(source_path)
        reason = "Analyzer process exited without producing a result"
        return create_error_result(filename, reason), reason

    status, payload = queue.get()
    if status == "ok":
        return payload, None

    filename = os.path.basename(source_path)
    reason = f"Analyzer worker failed: {payload}"
    return create_error_result(filename, reason), reason


def export_csv(path, rows, fields):
    with open(path, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fields)
        writer.writeheader()
        for row in rows:
            csv_row = {key: row.get(key, "") for key in fields}
            if isinstance(csv_row.get("exception_types"), list):
                csv_row["exception_types"] = ", ".join(csv_row["exception_types"])
            writer.writerow(csv_row)


def split_dataset(rows, train_ratio=TRAIN_RATIO, seed=RANDOM_SEED):
    shuffled = list(rows)
    random.Random(seed).shuffle(shuffled)

    if len(shuffled) <= 1:
        return shuffled, []

    split_index = max(1, int(len(shuffled) * train_ratio))
    split_index = min(split_index, len(shuffled) - 1)
    return shuffled[:split_index], shuffled[split_index:]

def create_error_result(filename, error_msg, defect_type="source_compile"):
    """Create a result object for files that failed analysis"""
    src_compile_errors = 1 if defect_type == "source_compile" else 0
    runtime_errors = 1 if defect_type == "runtime" else 0
    test_compile_errors = 1 if defect_type == "test_compile" else 0
    tests_failed = 1 if defect_type == "test_failure" else 0
    total_defects = src_compile_errors + runtime_errors + test_compile_errors + tests_failed
    defect_types = classify_error_types(
        src_compile_errors, runtime_errors, test_compile_errors, tests_failed
    )

    return {
        "file": filename,
        "class_name": os.path.splitext(filename)[0],
        "source_origin": "unknown",
        "source_topic": "",
        "loc": 0, "total_lines": 0, "blank_lines": 0, "comment_lines": 0,
        "class_count": 0, "method_count": 0, "field_count": 0, "import_count": 0,
        "if_count": 0, "loop_count": 0, "switch_count": 0, "catch_count": 0,
        "throw_count": 0, "return_count": 0, "public_method_count": 0,
        "static_method_count": 0, "has_main_method": False, "max_nesting_depth": 0,
        "cyclomatic_estimate": 0, "avg_method_loc": 0, "comment_ratio": 0,
        **{label: 0 for label in DEFECT_LABELS},
        "is_interactive_program": False,
        "src_compiled": False, "src_compile_errors": src_compile_errors, "src_warnings": 0,
        "runtime_attempted": defect_type == "runtime", "runtime_errors": runtime_errors, "exception_types": [],
        "test_exists": defect_type in {"test_compile", "test_failure"},
        "test_compiled": defect_type != "test_compile",
        "test_compile_errors": test_compile_errors,
        "test_warnings": 0, "tests_passed": 0, "tests_failed": tests_failed, "tests_total": tests_failed,
        "test_status": "analysis_failed",
        "total_defects": total_defects, "defect_density": 0, "density_grade": "Low",
        "is_defective": classify_binary_defect(total_defects), "defect_types": defect_types,
        "src_compile_out": error_msg[:400], "runtime_out": "", "test_compile_out": "", "junit_out": ""
    }


def save_progress(processed_files, skipped_files, current_index):
    """Save current progress to resume later"""
    progress = {
        "timestamp": datetime.now().isoformat(),
        "processed_files": processed_files,
        "skipped_files": skipped_files,
        "current_index": current_index,
        "total_processed": len(processed_files)
    }
    with open(PROGRESS_FILE, "w") as f:
        json.dump(progress, f, indent=2)


def load_progress():
    """Load previous progress if exists"""
    if os.path.exists(PROGRESS_FILE):
        try:
            with open(PROGRESS_FILE, "r") as f:
                return json.load(f)
        except:
            return None
    return None


def log_skipped_file(filename, reason):
    """Log skipped files for later review"""
    with open(SKIPPED_FILE, "a", newline="") as f:
        writer = csv.writer(f)
        writer.writerow([datetime.now().isoformat(), filename, reason])


def main():
    setup()
    manifest_map = load_manifest()
    
    # Load previous progress
    progress = load_progress()
    
    java_files = sorted([
        os.path.join(SOURCE_DIR, f)
        for f in os.listdir(SOURCE_DIR) if f.endswith(".java")
    ])

    if not java_files:
        print(f"No Java files found in '{SOURCE_DIR}/'")
        return

    # Determine starting point
    start_index = 0
    processed_files = []
    skipped_files = []
    
    if progress:
        start_index = progress.get("current_index", 0)
        processed_files = progress.get("processed_files", [])
        skipped_files = progress.get("skipped_files", [])
        print(f"Resuming from file {start_index+1}/{len(java_files)}")
        print(f"Previously processed: {len(processed_files)} files")
        print(f"Previously skipped: {len(skipped_files)} files")

    print(f"\n{'='*100}")
    print(f"  Defect Density Analyzer and Dataset Builder - {len(java_files)} files")
    print(f"{'='*100}")
    print(
        f"  {'File':<28} {'Origin':<8} {'LOC':>4} {'CE':>4} {'RE':>4} "
        f"{'TCE':>4} {'Pass':>5} {'Fail':>5} {'Def':>4} {'Density':>10}  Status"
    )
    print(f"  {'-'*98}")

    results = processed_files  # Load previously processed results
    T = dict(loc=0, ce=0, re=0, tce=0, passed=0, failed=0, defects=0)
    
    # Recalculate totals from processed files
    for r in results:
        T["loc"]     += r["loc"]
        T["ce"]      += r["src_compile_errors"]
        T["re"]      += r["runtime_errors"]
        T["tce"]     += r["test_compile_errors"]
        T["passed"]  += r["tests_passed"]
        T["failed"]  += r["tests_failed"]
        T["defects"] += r["total_defects"]

    # Process remaining files
    for i in range(start_index, len(java_files)):
        fp = java_files[i]
        filename = os.path.basename(fp)
        
        try:
            print(f"\nProcessing {i+1}/{len(java_files)}: {filename}", end=" ... ", flush=True)
            
            r, timeout_reason = analyze_file_with_timeout(fp, manifest_map)
            if timeout_reason:
                print(f"SKIPPED - {timeout_reason}")
                log_skipped_file(filename, timeout_reason)
                skipped_files.append(filename)
                results.append(r)
                T["loc"]     += r["loc"]
                T["ce"]      += r["src_compile_errors"]
                T["re"]      += r["runtime_errors"]
                T["tce"]     += r["test_compile_errors"]
                T["passed"]  += r["tests_passed"]
                T["failed"]  += r["tests_failed"]
                T["defects"] += r["total_defects"]
                save_progress(results, skipped_files, i + 1)
                continue
            
            # Check if analysis failed catastrophically
            if r.get("test_status") == "analysis_failed":
                print(f"SKIPPED - {r['src_compile_out'][:100]}")
                log_skipped_file(filename, r["src_compile_out"])
                skipped_files.append(filename)
                results.append(r)
                T["loc"]     += r["loc"]
                T["ce"]      += r["src_compile_errors"]
                T["re"]      += r["runtime_errors"]
                T["tce"]     += r["test_compile_errors"]
                T["passed"]  += r["tests_passed"]
                T["failed"]  += r["tests_failed"]
                T["defects"] += r["total_defects"]
                save_progress(results, skipped_files, i + 1)
                continue
            
            results.append(r)
            
            # Update totals
            T["loc"]     += r["loc"]
            T["ce"]      += r["src_compile_errors"]
            T["re"]      += r["runtime_errors"]
            T["tce"]     += r["test_compile_errors"]
            T["passed"]  += r["tests_passed"]
            T["failed"]  += r["tests_failed"]
            T["defects"] += r["total_defects"]

            print(f"OK {r['tests_passed']}/{r['tests_total']} tests")
            
            # Print summary line
            print(
                f"  {r['file']:<28} {r['source_origin']:<8} {r['loc']:>4} "
                f"{r['src_compile_errors']:>4} {r['runtime_errors']:>4} "
                f"{r['test_compile_errors']:>4} {r['tests_passed']:>5} "
                f"{r['tests_failed']:>5} {r['total_defects']:>4} "
                f"{r['defect_density']:>8}/KLOC  {r['test_status']}"
            )
            
            # Save progress every 5 files
            if (i + 1) % 5 == 0:
                save_progress(results, skipped_files, i + 1)
                print(f"Progress saved at file {i+1}")
                
        except KeyboardInterrupt:
            print(f"\n\nInterrupted by user. Saving progress...")
            save_progress(results, skipped_files, i)
            print(f"Progress saved. Resume later to continue from file {i+1}.")
            return
        except Exception as e:
            print(f"ERROR: {str(e)}")
            log_skipped_file(filename, f"Unexpected error: {str(e)}")
            skipped_files.append(filename)
            save_progress(results, skipped_files, i)
            continue

    # Final save
    save_progress(results, skipped_files, len(java_files))

    overall = round((T["defects"] / max(T["loc"], 1)) * 1000, 2)
    train_rows, test_rows = split_dataset(results)

    print(f"\n{'='*100}")
    print(f"  SUMMARY")
    print(f"  Total Files            : {len(results)}")
    print(f"  Skipped Files          : {len(skipped_files)}")
    print(f"  Total LOC              : {T['loc']}")
    print(f"  Source Compile Errors  : {T['ce']}")
    print(f"  Runtime Errors         : {T['re']}")
    print(f"  Test Compile Errors    : {T['tce']}")
    print(f"  JUnit Passed           : {T['passed']}")
    print(f"  JUnit Failed           : {T['failed']}")
    print(f"  Total Defects          : {T['defects']}")
    print(f"  Overall Density        : {overall} defects/KLOC")
    print(f"  Overall Grade          : {classify_density(overall)}")
    print(f"  Train Rows             : {len(train_rows)}")
    print(f"  Test Rows              : {len(test_rows)}")
    print(f"{'='*100}\n")

    # Export reports
    report_fields = [
        "file", "class_name", "source_origin", "source_topic", "loc",
        "is_interactive_program",
        "src_compiled", "src_compile_errors", "src_warnings",
        "runtime_attempted", "runtime_errors", "exception_types",
        "test_exists", "test_compiled", "test_compile_errors",
        "tests_passed", "tests_failed", "tests_total", "test_status",
        "total_defects", "defect_density", "density_grade",
        "is_defective", "defect_types"
    ]
    export_csv(REPORT_CSV, results, report_fields)

    dataset_fields = [
        "file", "class_name", "source_origin", "source_topic",
        "total_lines", "blank_lines", "comment_lines", "loc",
        "class_count", "method_count", "field_count", "import_count",
        "if_count", "loop_count", "switch_count", "catch_count",
        "throw_count", "return_count", "public_method_count",
        "static_method_count", "has_main_method", "max_nesting_depth",
        "cyclomatic_estimate", "avg_method_loc", "comment_ratio",
        *DEFECT_LABELS,
        "is_interactive_program",
        "src_compiled", "src_compile_errors", "src_warnings",
        "runtime_attempted", "runtime_errors",
        "test_exists", "test_compiled", "test_compile_errors", "test_warnings",
        "tests_passed", "tests_failed", "tests_total", "test_status",
        "total_defects", "defect_density", "density_grade",
        "is_defective", "defect_types"
    ]
    export_csv(DATASET_CSV, results, dataset_fields)
    export_csv(TRAIN_CSV, train_rows, dataset_fields)
    export_csv(TEST_CSV, test_rows, dataset_fields)

    print(f"  Reports saved:")
    print(f"    {REPORT_CSV}")
    print(f"    {DATASET_CSV}")
    print(f"    {TRAIN_CSV}")
    print(f"    {TEST_CSV}")
    if skipped_files:
        print(f"    {SKIPPED_FILE} (review skipped files)")
    print(f"    {PROGRESS_FILE} (resume checkpoint)\n")
    
    # Clean up progress file on successful completion
    if os.path.exists(PROGRESS_FILE):
        os.remove(PROGRESS_FILE)


if __name__ == "__main__":
    main()
