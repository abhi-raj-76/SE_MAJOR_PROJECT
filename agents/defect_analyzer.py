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
import subprocess
import csv
import random
import urllib.request
from defect_rules import DEFECT_LABELS, build_defect_label_columns

SOURCE_DIR  = "java_samples"
TEST_DIR    = "test_samples"
REPORT_CSV  = "defect_report.csv"
DATASET_CSV = "defect_dataset.csv"
TRAIN_CSV   = "defect_dataset_train.csv"
TEST_CSV    = "defect_dataset_test.csv"
BUILD_DIR   = "build"
MANIFEST_CSV = "sample_manifest.csv"
TRAIN_RATIO = 0.8
RANDOM_SEED = 42

JUNIT_JAR_URL = (
    "https://repo1.maven.org/maven2/org/junit/platform/"
    "junit-platform-console-standalone/1.10.0/"
    "junit-platform-console-standalone-1.10.0-all.jar"
)
JUNIT_JAR = os.path.join(BUILD_DIR, "junit-standalone.jar")


def setup():
    os.makedirs(os.path.join(BUILD_DIR, "classes"), exist_ok=True)
    os.makedirs(os.path.join(BUILD_DIR, "test-classes"), exist_ok=True)

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


def compile_source(filepath):
    out_dir = os.path.join(BUILD_DIR, "classes")
    rc, stdout, stderr = run_cmd(["javac", "-d", out_dir, filepath])
    output   = stderr + stdout
    errors   = len(re.findall(r'\berror:', output))
    warnings = len(re.findall(r'\bwarning:', output))
    return rc == 0, errors, warnings, output


def run_source(class_name):
    classes_dir = os.path.join(BUILD_DIR, "classes")
    rc, stdout, stderr = run_cmd(
        ["java", "-cp", classes_dir, class_name], timeout=10
    )
    output = stderr + stdout
    exceptions = re.findall(
        r'(java\.[\w.]+(?:Exception|Error)|Exception in thread)', output
    )
    ex_types = sorted(set(exceptions))
    return len(exceptions), ex_types, output


def compile_test(test_filepath):
    if not os.path.exists(test_filepath):
        return False, 0, 0, "No test file"

    src_cp    = os.path.join(BUILD_DIR, "classes")
    test_out  = os.path.join(BUILD_DIR, "test-classes")
    classpath = f"{src_cp}{os.pathsep}{JUNIT_JAR}"

    rc, stdout, stderr = run_cmd(
        ["javac", "-cp", classpath, "-d", test_out, test_filepath]
    )
    output   = stderr + stdout
    errors   = len(re.findall(r'\berror:', output))
    warnings = len(re.findall(r'\bwarning:', output))
    return rc == 0, errors, warnings, output

def run_tests(test_class_name):
    if not os.path.exists(JUNIT_JAR):
        return 0, 0, 0, "JUnit JAR missing"

    src_cp    = os.path.join(BUILD_DIR, "classes")
    test_cp   = os.path.join(BUILD_DIR, "test-classes")
    classpath = f"{src_cp}{os.pathsep}{test_cp}{os.pathsep}{JUNIT_JAR}"

    rc, stdout, stderr = run_cmd([
        "java", "-jar", JUNIT_JAR,
        "--class-path", classpath,
        "--select-class", test_class_name,
        "--details", "summary"
    ], timeout=30)

    output = stdout + stderr

    passed = 0
    failed = 0
    m = re.search(r'\[(\d+)\] tests successful', output)
    if m:
        passed = int(m.group(1))
    m = re.search(r'\[(\d+)\] tests failed', output)
    if m:
        failed = int(m.group(1))

    if passed == 0 and failed == 0:
        passed = len(re.findall(r'\bPASSED\b', output))
        failed = len(re.findall(r'\bFAILED\b|\bABORTED\b', output))

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

    with open(source_path, "r", encoding="utf-8", errors="ignore") as f:
        code = f.read()

    class_name = extract_class_name(code, os.path.splitext(filename)[0])
    metrics    = extract_static_metrics(code)
    interactive_program = is_interactive_program(code)
    defect_label_columns = build_defect_label_columns(code)
    manifest_row = manifest_map.get(filename, {})
    source_origin = infer_origin(filename, manifest_row)
    source_topic = manifest_row.get("source_topic", "")

    # 1. Compile source
    src_ok, src_err, src_warn, src_out = compile_source(source_path)

    # 2. Run source
    rt_count, ex_types, run_out = (0, [], "")
    runtime_attempted = metrics["has_main_method"] and src_ok and not interactive_program
    if runtime_attempted:
        rt_count, ex_types, run_out = run_source(class_name)

    # 3. Compile test
    test_path = os.path.join(TEST_DIR, f"{class_name}Test.java")
    test_exists = os.path.exists(test_path)
    t_ok, t_err, t_warn, t_out = compile_test(test_path)

    # 4. Run JUnit
    passed, failed, total_tests, junit_out = (0, 0, 0, "")
    if test_exists and t_ok:
        passed, failed, total_tests, junit_out = run_tests(f"{class_name}Test")

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

def main():
    setup()
    manifest_map = load_manifest()

    java_files = sorted([
        os.path.join(SOURCE_DIR, f)
        for f in os.listdir(SOURCE_DIR) if f.endswith(".java")
    ])

    if not java_files:
        print(f"No Java files found in '{SOURCE_DIR}/'")
        return

    print(f"\n{'='*100}")
    print(f"  Defect Density Analyzer and Dataset Builder - {len(java_files)} files")
    print(f"{'='*100}")
    print(
        f"  {'File':<28} {'Origin':<8} {'LOC':>4} {'CE':>4} {'RE':>4} "
        f"{'TCE':>4} {'Pass':>5} {'Fail':>5} {'Def':>4} {'Density':>10}  Status"
    )
    print(f"  {'-'*98}")

    results = []
    T = dict(loc=0, ce=0, re=0, tce=0, passed=0, failed=0, defects=0)

    for fp in java_files:
        r = analyze_file(fp, manifest_map)
        results.append(r)

        T["loc"]     += r["loc"]
        T["ce"]      += r["src_compile_errors"]
        T["re"]      += r["runtime_errors"]
        T["tce"]     += r["test_compile_errors"]
        T["passed"]  += r["tests_passed"]
        T["failed"]  += r["tests_failed"]
        T["defects"] += r["total_defects"]

        print(
            f"  {r['file']:<28} {r['source_origin']:<8} {r['loc']:>4} "
            f"{r['src_compile_errors']:>4} {r['runtime_errors']:>4} "
            f"{r['test_compile_errors']:>4} {r['tests_passed']:>5} "
            f"{r['tests_failed']:>5} {r['total_defects']:>4} "
            f"{r['defect_density']:>8}/KLOC  {r['test_status']}"
        )

    overall = round((T["defects"] / max(T["loc"], 1)) * 1000, 2)
    train_rows, test_rows = split_dataset(results)

    print(f"\n{'='*100}")
    print(f"  SUMMARY")
    print(f"  Total Files            : {len(results)}")
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
    print(f"    {TEST_CSV}\n")


if __name__ == "__main__":
    main()
