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
import json
import subprocess
import csv
import urllib.request
from datetime import datetime

SOURCE_DIR  = "java_samples"
TEST_DIR    = "test_samples"
REPORT_JSON = "defect_report.json"
REPORT_CSV  = "defect_report.csv"
BUILD_DIR   = "build"

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
    ex_types = list(set(exceptions))
    return len(ex_types), ex_types, output


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
    if d == 0:      return "Clean"
    elif d < 10:    return "Low"
    elif d < 30:    return "Medium"
    else:           return "High"


def analyze_file(source_path):
    filename = os.path.basename(source_path)

    with open(source_path, "r", encoding="utf-8", errors="ignore") as f:
        code = f.read()

    loc        = count_loc(code)
    class_name = extract_class_name(code, os.path.splitext(filename)[0])

    # 1. Compile source
    src_ok, src_err, src_warn, src_out = compile_source(source_path)

    # 2. Run source
    rt_count, ex_types, run_out = (0, [], "")
    if src_ok:
        rt_count, ex_types, run_out = run_source(class_name)

    # 3. Compile test
    test_path = os.path.join(TEST_DIR, f"{class_name}Test.java")
    test_exists = os.path.exists(test_path)
    t_ok, t_err, t_warn, t_out = compile_test(test_path)

    # 4. Run JUnit
    passed, failed, total_tests, junit_out = (0, 0, 0, "")
    if test_exists and t_ok:
        passed, failed, total_tests, junit_out = run_tests(f"{class_name}Test")

    # Defect density
    total_defects  = src_err + rt_count + t_err + failed
    density        = round((total_defects / loc) * 1000, 2)

    return {
        "file":                filename,
        "class_name":          class_name,
        "loc":                 loc,

        "src_compiled":        src_ok,
        "src_compile_errors":  src_err,
        "src_warnings":        src_warn,
        "runtime_errors":      rt_count,
        "exception_types":     ex_types,

        "test_exists":         test_exists,
        "test_compiled":       t_ok,
        "test_compile_errors": t_err,
        "tests_passed":        passed,
        "tests_failed":        failed,
        "tests_total":         total_tests,

        "total_defects":       total_defects,
        "defect_density":      density,
        "density_grade":       classify_density(density),

        # raw outputs for debugging
        "src_compile_out":     src_out[:400],
        "test_compile_out":    t_out[:400],
        "junit_out":           junit_out[:400],
    }

def main():
    setup()

    java_files = sorted([
        os.path.join(SOURCE_DIR, f)
        for f in os.listdir(SOURCE_DIR) if f.endswith(".java")
    ])

    if not java_files:
        print(f"No Java files found in '{SOURCE_DIR}/'")
        return

    print(f"\n{'='*80}")
    print(f"  Defect Density Analyzer — {len(java_files)} files")
    print(f"{'='*80}")
    print(f"  {'File':<28} {'LOC':>4}  {'CE':>4} {'RE':>4} {'TCE':>4} {'Pass':>5} {'Fail':>5}  {'Density':>10}  Grade")
    print(f"  {'CE=Compile Err  RE=Runtime Err  TCE=Test Compile Err':^70}")
    print(f"  {'-'*78}")

    results = []
    T = dict(loc=0, ce=0, re=0, tce=0, passed=0, failed=0, defects=0)

    for fp in java_files:
        r = analyze_file(fp)
        results.append(r)

        T["loc"]     += r["loc"]
        T["ce"]      += r["src_compile_errors"]
        T["re"]      += r["runtime_errors"]
        T["tce"]     += r["test_compile_errors"]
        T["passed"]  += r["tests_passed"]
        T["failed"]  += r["tests_failed"]
        T["defects"] += r["total_defects"]

        print(
            f"  {r['file']:<28} {r['loc']:>4}  "
            f"{r['src_compile_errors']:>4} {r['runtime_errors']:>4} "
            f"{r['test_compile_errors']:>4} {r['tests_passed']:>5} "
            f"{r['tests_failed']:>5}  {r['defect_density']:>8}/KLOC  {r['density_grade']}"
        )

    overall = round((T["defects"] / max(T["loc"], 1)) * 1000, 2)

    print(f"\n{'='*80}")
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
    print(f"{'='*80}\n")

    with open(REPORT_JSON, "w", encoding="utf-8") as f:
        json.dump({
            "generated_at":        datetime.now().isoformat(),
            "total_files":         len(results),
            "total_loc":           T["loc"],
            "src_compile_errors":  T["ce"],
            "runtime_errors":      T["re"],
            "test_compile_errors": T["tce"],
            "junit_passed":        T["passed"],
            "junit_failed":        T["failed"],
            "total_defects":       T["defects"],
            "overall_density":     overall,
            "overall_grade":       classify_density(overall),
            "files":               results
        }, f, indent=2)

    fields = [
        "file", "class_name", "loc",
        "src_compiled", "src_compile_errors", "src_warnings",
        "runtime_errors", "exception_types",
        "test_exists", "test_compiled", "test_compile_errors",
        "tests_passed", "tests_failed", "tests_total",
        "total_defects", "defect_density", "density_grade"
    ]
    with open(REPORT_CSV, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=fields)
        w.writeheader()
        for r in results:
            row = {k: r[k] for k in fields}
            row["exception_types"] = ", ".join(r["exception_types"])
            w.writerow(row)

    print(f"  Reports saved:")
    print(f"    {REPORT_JSON}")
    print(f"    {REPORT_CSV}\n")


if __name__ == "__main__":
    main()