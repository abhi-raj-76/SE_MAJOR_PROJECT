import json
import os

import joblib
import pandas as pd
from sklearn.compose import ColumnTransformer
from sklearn.dummy import DummyClassifier
from sklearn.ensemble import RandomForestClassifier, GradientBoostingClassifier
from sklearn.linear_model import LogisticRegression
from sklearn.impute import SimpleImputer
from sklearn.metrics import accuracy_score, classification_report, confusion_matrix
from sklearn.model_selection import train_test_split
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import OneHotEncoder, StandardScaler
from defect_rules import DEFECT_LABELS

TRAIN_CSV = "defect_dataset_train.csv"
TEST_CSV = "defect_dataset_test.csv"
FULL_DATASET_CSV = "defect_dataset.csv"
MODEL_DIR = "model_artifacts"
MODEL_PATH = os.path.join(MODEL_DIR, "defect_model_bundle.joblib")
METRICS_PATH = os.path.join(MODEL_DIR, "model_metrics.json")
PREDICTIONS_PATH = os.path.join(MODEL_DIR, "test_predictions.csv")
COMPARISON_PATH = os.path.join(MODEL_DIR, "model_comparison.json")
RANDOM_SEED = 42
BINARY_LABELS = [0, 1]

TARGET_COLUMN = "is_defective"
DROP_COLUMNS = [
    "file",
    "class_name",
    "source_topic",
    "defect_types",
    "density_grade",
    "exception_types",
    *DEFECT_LABELS,
]
IS_DEFECTIVE_LEAKAGE_COLUMNS = [
    "src_compile_errors",
    "runtime_errors",
    "test_compile_errors",
    "tests_failed",
    "total_defects",
    "defect_density",
]
IS_DEFECTIVE_DYNAMIC_OUTCOME_COLUMNS = [
    "src_compiled",
    "src_warnings",
    "runtime_attempted",
    "test_exists",
    "test_compiled",
    "test_warnings",
    "tests_passed",
    "tests_total",
    "test_status",
]


def ensure_datasets_exist():
    if os.path.exists(TRAIN_CSV) and os.path.exists(TEST_CSV):
        return pd.read_csv(TRAIN_CSV), pd.read_csv(TEST_CSV)

    if os.path.exists(FULL_DATASET_CSV):
        full_df = pd.read_csv(FULL_DATASET_CSV)
        train_df, test_df = train_test_split(
            full_df,
            test_size=0.2,
            random_state=RANDOM_SEED,
            stratify=full_df[TARGET_COLUMN] if TARGET_COLUMN in full_df.columns else None,
        )
        return train_df.reset_index(drop=True), test_df.reset_index(drop=True)

    raise FileNotFoundError(
        "No dataset CSVs found. Run defect_analyzer.py first to generate "
        "defect_dataset.csv or defect_dataset_train.csv / defect_dataset_test.csv."
    )


def prepare_features(df, target_name=TARGET_COLUMN):
    cleaned = df.copy()
    drop_columns = list(DROP_COLUMNS)
    if target_name == TARGET_COLUMN:
        drop_columns.extend(IS_DEFECTIVE_LEAKAGE_COLUMNS)
        drop_columns.extend(IS_DEFECTIVE_DYNAMIC_OUTCOME_COLUMNS)

    cleaned = cleaned.drop(
        columns=[column for column in drop_columns if column in cleaned.columns],
        errors="ignore",
    )

    if TARGET_COLUMN not in cleaned.columns:
        raise ValueError(f"Missing required target column: {TARGET_COLUMN}")

    y = cleaned[TARGET_COLUMN].astype(int)
    X = cleaned.drop(columns=[TARGET_COLUMN])
    return X, y


def prepare_target(df, target_column):
    if target_column not in df.columns:
        raise ValueError(f"Missing required target column: {target_column}")
    return df[target_column].astype(int)


def build_preprocessor(X, scale_numeric=False):
    numeric_features = X.select_dtypes(include=["number", "bool"]).columns.tolist()
    categorical_features = [column for column in X.columns if column not in numeric_features]

    numeric_steps = [("imputer", SimpleImputer(strategy="median"))]
    if scale_numeric:
        numeric_steps.append(("scaler", StandardScaler()))

    numeric_pipeline = Pipeline(steps=numeric_steps)

    categorical_pipeline = Pipeline(
        steps=[
            ("imputer", SimpleImputer(strategy="most_frequent")),
            ("onehot", OneHotEncoder(handle_unknown="ignore")),
        ]
    )

    return ColumnTransformer(
        transformers=[
            ("num", numeric_pipeline, numeric_features),
            ("cat", categorical_pipeline, categorical_features),
        ]
    )


def build_model_pipelines(X):
    pipelines = {}

    pipelines["logistic_regression"] = Pipeline(
        steps=[
            ("preprocessor", build_preprocessor(X, scale_numeric=True)),
            (
                "model",
                LogisticRegression(
                    max_iter=2000,
                    class_weight="balanced",
                    random_state=RANDOM_SEED,
                ),
            ),
        ]
    )

    pipelines["random_forest"] = Pipeline(
        steps=[
            ("preprocessor", build_preprocessor(X, scale_numeric=False)),
            (
                "model",
                RandomForestClassifier(
                    n_estimators=300,
                    random_state=RANDOM_SEED,
                    class_weight="balanced",
                    n_jobs=-1,
                ),
            ),
        ]
    )

    pipelines["gradient_boosting"] = Pipeline(
        steps=[
            ("preprocessor", build_preprocessor(X, scale_numeric=False)),
            (
                "model",
                GradientBoostingClassifier(
                    random_state=RANDOM_SEED,
                ),
            ),
        ]
    )

    return pipelines


def build_constant_pipeline(X, constant_value):
    return Pipeline(
        steps=[
            ("preprocessor", build_preprocessor(X, scale_numeric=False)),
            (
                "model",
                DummyClassifier(strategy="constant", constant=int(constant_value)),
            ),
        ]
    )


def evaluate_pipeline(name, pipeline, X_test, y_test, test_df):
    y_pred = pipeline.predict(X_test)
    y_prob = None
    if hasattr(pipeline, "predict_proba"):
        probabilities = pipeline.predict_proba(X_test)
        if getattr(probabilities, "shape", (0, 0))[1] >= 2:
            y_prob = probabilities[:, 1]
        elif getattr(probabilities, "shape", (0, 0))[1] == 1:
            positive_class = 1
            model_classes = None
            final_estimator = pipeline.named_steps.get("model")
            if final_estimator is not None and hasattr(final_estimator, "classes_"):
                model_classes = list(final_estimator.classes_)
            if model_classes == [positive_class]:
                y_prob = probabilities[:, 0]
            else:
                y_prob = [0.0 for _ in range(len(X_test))]

    metrics = {
        "model_name": name,
        "accuracy": round(float(accuracy_score(y_test, y_pred)), 4),
        "confusion_matrix": confusion_matrix(
            y_test, y_pred, labels=BINARY_LABELS
        ).tolist(),
        "classification_report": classification_report(
            y_test,
            y_pred,
            labels=BINARY_LABELS,
            target_names=["0", "1"],
            output_dict=True,
            zero_division=0,
        ),
    }

    predictions_df = test_df.copy()
    predictions_df["predicted_is_defective"] = y_pred
    if y_prob is not None:
        predictions_df["predicted_defect_probability"] = y_prob

    return metrics, predictions_df


def model_sort_key(result):
    report = result["metrics"]["classification_report"]
    weighted_f1 = report.get("weighted avg", {}).get("f1-score", 0.0)
    accuracy = result["metrics"].get("accuracy", 0.0)
    return (weighted_f1, accuracy)


def format_accuracy_pct(value):
    return f"{float(value) * 100:.2f}%"


def main():
    os.makedirs(MODEL_DIR, exist_ok=True)

    train_df, test_df = ensure_datasets_exist()
    all_targets = [TARGET_COLUMN] + DEFECT_LABELS
    model_bundle = {
        "features": {},
        "targets": {},
    }
    overall_metrics = {}
    overall_comparison = {}
    best_predictions_df = test_df.copy()

    for target_name in all_targets:
        X_train_target, _ = prepare_features(train_df, target_name=target_name)
        X_test_target, _ = prepare_features(test_df, target_name=target_name)
        y_train_target = prepare_target(train_df, target_name)
        y_test_target = prepare_target(test_df, target_name)
        evaluation_results = []
        unique_classes = sorted(y_train_target.unique().tolist())

        if len(unique_classes) < 2:
            constant_value = unique_classes[0]
            pipeline = build_constant_pipeline(X_train_target, constant_value)
            pipeline.fit(X_train_target, y_train_target)
            metrics, predictions_df = evaluate_pipeline(
                "constant_baseline",
                pipeline,
                X_test_target,
                y_test_target,
                test_df,
            )
            metrics["note"] = (
                f"Training data for {target_name} contained only one class ({constant_value}), "
                "so a constant baseline model was used."
            )
            evaluation_results.append(
                {
                    "model_name": "constant_baseline",
                    "pipeline": pipeline,
                    "metrics": metrics,
                    "predictions_df": predictions_df,
                }
            )
        else:
            pipelines = build_model_pipelines(X_train_target)
            for model_name, pipeline in pipelines.items():
                pipeline.fit(X_train_target, y_train_target)
                metrics, predictions_df = evaluate_pipeline(
                    model_name,
                    pipeline,
                    X_test_target,
                    y_test_target,
                    test_df,
                )
                evaluation_results.append(
                    {
                        "model_name": model_name,
                        "pipeline": pipeline,
                        "metrics": metrics,
                        "predictions_df": predictions_df,
                    }
                )

        best_result = max(evaluation_results, key=model_sort_key)
        model_bundle["targets"][target_name] = {
            "best_model_name": best_result["model_name"],
            "pipeline": best_result["pipeline"],
        }
        model_bundle["features"][target_name] = X_train_target.columns.tolist()

        overall_metrics[target_name] = {
            "best_model": best_result["model_name"],
            "feature_count": int(X_train_target.shape[1]),
            "features": X_train_target.columns.tolist(),
            **best_result["metrics"],
        }
        overall_metrics[target_name]["accuracy_percent"] = format_accuracy_pct(
            overall_metrics[target_name]["accuracy"]
        )
        overall_comparison[target_name] = [
            {
                "model_name": result["model_name"],
                "accuracy": result["metrics"]["accuracy"],
                "accuracy_percent": format_accuracy_pct(result["metrics"]["accuracy"]),
                "classification_report": result["metrics"]["classification_report"],
                "confusion_matrix": result["metrics"]["confusion_matrix"],
            }
            for result in evaluation_results
        ]

        if target_name == TARGET_COLUMN:
            best_predictions_df = best_result["predictions_df"]

    final_metrics = {
        "train_rows": int(len(train_df)),
        "test_rows": int(len(test_df)),
        "feature_count": int(len(model_bundle["features"].get(TARGET_COLUMN, []))),
        "features": model_bundle["features"].get(TARGET_COLUMN, []),
        "targets": overall_metrics,
    }

    comparison = {
        "train_rows": int(len(train_df)),
        "test_rows": int(len(test_df)),
        "feature_count": int(len(model_bundle["features"].get(TARGET_COLUMN, []))),
        "features": model_bundle["features"].get(TARGET_COLUMN, []),
        "targets": overall_comparison,
    }

    joblib.dump(model_bundle, MODEL_PATH)

    with open(METRICS_PATH, "w", encoding="utf-8") as f:
        json.dump(final_metrics, f, indent=2)

    with open(COMPARISON_PATH, "w", encoding="utf-8") as f:
        json.dump(comparison, f, indent=2)

    best_predictions_df.to_csv(PREDICTIONS_PATH, index=False)

    print("Model training complete")
    print(f"Train rows     : {len(train_df)}")
    print(f"Test rows      : {len(test_df)}")
    print(f"Feature count  : {len(model_bundle['features'][TARGET_COLUMN])}")
    print(f"Overall best   : {final_metrics['targets'][TARGET_COLUMN]['best_model']}")
    print(f"Accuracy       : {final_metrics['targets'][TARGET_COLUMN]['accuracy_percent']}")
    print("Artifacts saved:")
    print(f"  {MODEL_PATH}")
    print(f"  {METRICS_PATH}")
    print(f"  {COMPARISON_PATH}")
    print(f"  {PREDICTIONS_PATH}")


if __name__ == "__main__":
    main()
