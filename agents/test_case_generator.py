import os
import re
import requests

OLLAMA_URL = "http://localhost:11434/api/generate"
MODEL = "codellama:7b"

SOURCE_DIR = "java_samples"
TEST_DIR = "test_samples"

os.makedirs(TEST_DIR, exist_ok=True)


def clean_code(response):
    """Strip markdown backticks from LLM response."""
    response = re.sub(r'```java', '', response)
    response = re.sub(r'```', '', response)
    response = re.sub(r'```\w*', '', response)
    return response.strip()


def extract_class_info(java_code):
    """Extract class name and public method signatures from Java source."""
    class_match = re.search(r'public\s+class\s+(\w+)', java_code)
    class_name = class_match.group(1) if class_match else "UnknownClass"

    # Extract public method signatures (not main)
    methods = re.findall(
        r'public\s+(?:static\s+)?(\w[\w<>\[\]]*)\s+(\w+)\s*\(([^)]*)\)',
        java_code
    )
    method_list = []
    for ret_type, method_name, params in methods:
        if method_name != "main":
            method_list.append(f"{ret_type} {method_name}({params})")

    return class_name, method_list


def generate_test_case(java_code, class_name, methods):
    method_info = "\n".join(f"  - {m}" for m in methods) if methods else "  - (only main method found)"

    prompt = f"""You are a Java developer writing JUnit 5 unit tests.

Source class name: {class_name}
Available public methods:
{method_info}

Rules (STRICTLY FOLLOW):
- Return ONLY raw Java code
- NO markdown, NO backticks, NO explanations
- Start directly with import statements
- Test class name must be: {class_name}Test
- Only test methods that actually exist in the source
- Use @Test annotation for each test method
- Add import java.util.Scanner; only if Scanner is used in source
- Do NOT use Scanner in tests — pass values directly to methods
- If class only has main(), write a simple smoke test using System.out

Java Source Code:
{java_code}
"""

    try:
        response = requests.post(
            OLLAMA_URL,
            json={"model": MODEL, "prompt": prompt, "stream": False},
            timeout=300
        )
        response.raise_for_status()
        raw = response.json().get("response", "")
        return clean_code(raw)

    except Exception as e:
        print(f"  Error: {e}")
        return ""


def validate_test_code(test_code, class_name):
    """Basic validation — check test class exists and no backticks."""
    if '`' in test_code:
        return False, "backticks found"
    if f"class {class_name}Test" not in test_code:
        return False, f"missing class {class_name}Test"
    if "@Test" not in test_code:
        return False, "no @Test annotations"
    return True, "ok"


def main():
    java_files = [f for f in os.listdir(SOURCE_DIR) if f.endswith(".java")]

    if not java_files:
        print("No Java files found in java_samples/")
        return

    print(f"Found {len(java_files)} Java files\n")

    success, skipped, failed = 0, 0, 0

    for file in java_files:
        source_path = os.path.join(SOURCE_DIR, file)

        # Read source
        try:
            with open(source_path, "r", encoding="utf-8") as f:
                java_code = f.read()
        except Exception as e:
            print(f"  Read error {file}: {e}")
            failed += 1
            continue

        # Extract class name and methods
        class_name, methods = extract_class_info(java_code)
        test_filename = f"{class_name}Test.java"
        test_path = os.path.join(TEST_DIR, test_filename)

        if os.path.exists(test_path):
            print(f"  Skipping {class_name} (already exists)")
            skipped += 1
            continue

        print(f"  Generating test for {class_name} ({len(methods)} methods)...", end=" ")

        test_code = generate_test_case(java_code, class_name, methods)

        if not test_code:
            print("Empty response")
            failed += 1
            continue

        # Validate
        valid, reason = validate_test_code(test_code, class_name)
        if not valid:
            print(f"Invalid ({reason}) — retrying...")
            test_code = generate_test_case(java_code, class_name, methods)
            valid, reason = validate_test_code(test_code, class_name)
            if not valid:
                print(f"Retry failed ({reason})")
                failed += 1
                continue

        with open(test_path, "w", encoding="utf-8") as f:
            f.write(test_code)
        print(f"Saved {test_filename}")
        success += 1

    print(f"\nDone — {success} generated | {skipped} skipped | {failed} failed")


if __name__ == "__main__":
    main()