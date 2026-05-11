from dotenv import load_dotenv
import base64
import csv
import json
import os
import re
import requests
import time

load_dotenv()

GITHUB_TOKEN = os.getenv("GITHUB_TOKEN")
if not GITHUB_TOKEN:
    raise ValueError("GITHUB_TOKEN missing from .env")

HEADERS = {"Authorization": f"token {GITHUB_TOKEN}"}
OLLAMA_URL = "http://localhost:11434/api/generate"
MODEL = "qwen2.5-coder:1.5b"
SAVE_DIR = "java_samples"
MANIFEST_JSON = "sample_manifest.json"
MANIFEST_CSV = "sample_manifest.csv"
os.makedirs(SAVE_DIR, exist_ok=True)

TOPICS = ["sorting algorithms", "OOP inheritance", "recursion",
          "file handling", "collections", "generics", "multithreading",
          "exception handling", "linked list", "binary search"]


def extract_class_name(code):
    """Extract public class name to use as filename."""
    match = re.search(r'public\s+class\s+(\w+)', code)
    return match.group(1) if match else None


def clean_code(code):
    """Strip markdown backticks from LLM response."""
    code = re.sub(r'```java', '', code)
    code = re.sub(r'```', '', code)
    return code.strip()


def dedupe_filename(filename, used_names):
    """Avoid collisions when multiple samples produce the same class name."""
    if filename not in used_names:
        used_names.add(filename)
        return filename

    base, ext = os.path.splitext(filename)
    index = 2
    while True:
        candidate = f"{base}_{index}{ext}"
        if candidate not in used_names:
            used_names.add(candidate)
            return candidate
        index += 1


def fetch_github_java(n):
    n = min(n, 30)
    url = "https://api.github.com/search/code"
    params = {"q": "extension:java", "per_page": n}

    try:
        response = requests.get(url, headers=HEADERS, params=params)
        response.raise_for_status()
        data = response.json()
    except requests.RequestException as e:
        print(f"GitHub search failed: {e}")
        return []

    codes = []
    for item in data.get("items", []):
        try:
            file_data = requests.get(item["url"], headers=HEADERS).json()
            content = file_data.get("content")
            if content:
                codes.append({
                    "code": base64.b64decode(content).decode("utf-8"),
                    "source_origin": "github",
                    "source_topic": "",
                    "source_url": item.get("html_url", ""),
                    "github_api_url": item.get("url", ""),
                })
            time.sleep(1)
        except Exception as e:
            print(f"  Skipping file: {e}")

    return codes


def generate_codellama_java(n):
    codes = []
    for i in range(n):
        topic = TOPICS[i % len(TOPICS)]
        prompt = f"Write a simple Java class for: {topic}. Max 40 lines. Return ONLY raw Java code, no markdown, no backticks."

        try:
            response = requests.post(OLLAMA_URL, json={
                "model": MODEL,
                "prompt": prompt,
                "stream": False
            }, timeout=300)
            response.raise_for_status()
            code = clean_code(response.json()["response"])
            codes.append({
                "code": code,
                "source_origin": "llm",
                "source_topic": topic,
                "source_url": "",
                "github_api_url": "",
            })
            print(f"  Ollama [{i+1}/{n}] {topic}")
        except Exception as e:
            print(f"  Ollama [{i+1}/{n}] {e}")

    return codes


def write_manifest(records):
    with open(MANIFEST_JSON, "w", encoding="utf-8") as f:
        json.dump(records, f, indent=2)

    fields = [
        "file",
        "class_name",
        "source_origin",
        "source_topic",
        "source_url",
        "github_api_url",
    ]
    with open(MANIFEST_CSV, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fields)
        writer.writeheader()
        for record in records:
            writer.writerow({key: record.get(key, "") for key in fields})


def main():
    total = int(input("Enter total number of Java samples (10-1000): "))
    github_count = min(total // 2, 30)
    ollama_count = total - github_count

    print(f"\nFetching {github_count} from GitHub...")
    github_codes = fetch_github_java(github_count)

    print(f"Generating {ollama_count} via Ollama...")
    ollama_codes = generate_codellama_java(ollama_count)

    all_codes = github_codes + ollama_codes
    used_names = set()
    manifest_records = []
    saved = 0
    for i, sample in enumerate(all_codes):
        code = sample["code"]
        class_name = extract_class_name(code)
        raw_filename = f"{class_name}.java" if class_name else f"sample_{i+1}.java"
        filename = dedupe_filename(raw_filename, used_names)
        path = os.path.join(SAVE_DIR, filename)
        with open(path, "w", encoding="utf-8") as f:
            f.write(code)

        manifest_records.append({
            "file": filename,
            "class_name": class_name or os.path.splitext(filename)[0],
            "source_origin": sample["source_origin"],
            "source_topic": sample["source_topic"],
            "source_url": sample["source_url"],
            "github_api_url": sample["github_api_url"],
        })

        print(f"  Saved {filename} [{sample['source_origin']}]")
        saved += 1

    write_manifest(manifest_records)

    print(f"\n{saved} Java files saved to '{SAVE_DIR}/'")
    print(f"Manifest saved to '{MANIFEST_JSON}' and '{MANIFEST_CSV}'")


if __name__ == "__main__":
    main()