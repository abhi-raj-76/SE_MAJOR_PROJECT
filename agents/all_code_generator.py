from dotenv import load_dotenv
import os
import re
import requests
import base64
import time

load_dotenv()

GITHUB_TOKEN = os.getenv("GITHUB_TOKEN")
if not GITHUB_TOKEN:
    raise ValueError("GITHUB_TOKEN missing from .env")

HEADERS = {"Authorization": f"token {GITHUB_TOKEN}"}
OLLAMA_URL = "http://localhost:11434/api/generate"
MODEL = "codellama:7b"
SAVE_DIR = "java_samples"
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
                codes.append(base64.b64decode(content).decode("utf-8"))
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
            codes.append(code)
            print(f"  Ollama [{i+1}/{n}] {topic}")
        except Exception as e:
            print(f"  Ollama [{i+1}/{n}] {e}")

    return codes


def main():
    total = int(input("Enter total number of Java samples (10-1000): "))
    github_count = min(total // 2, 30)
    ollama_count = total - github_count

    print(f"\nFetching {github_count} from GitHub...")
    github_codes = fetch_github_java(github_count)

    print(f"Generating {ollama_count} via Ollama...")
    ollama_codes = generate_codellama_java(ollama_count)

    all_codes = github_codes + ollama_codes
    saved = 0
    for i, code in enumerate(all_codes):
        class_name = extract_class_name(code)
        filename = f"{class_name}.java" if class_name else f"sample_{i+1}.java"
        path = os.path.join(SAVE_DIR, filename)
        with open(path, "w", encoding="utf-8") as f:
            f.write(code)
        print(f"  Saved {filename}")
        saved += 1

    print(f"\n{saved} Java files saved to '{SAVE_DIR}/'")
