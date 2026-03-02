from dotenv import load_dotenv
import os
import requests
import base64
import time

load_dotenv()

GITHUB_TOKEN = os.getenv("GITHUB_TOKEN")
if not GITHUB_TOKEN:
    raise ValueError("GITHUB_TOKEN missing from .env")

HEADERS = {"Authorization": f"token {GITHUB_TOKEN}"}
OLLAMA_URL = "http://localhost:11434/api/generate"
MODEL = "codellama"
SAVE_DIR = "java_samples"
os.makedirs(SAVE_DIR, exist_ok=True)

TOPICS = ["sorting algorithms", "OOP inheritance", "recursion",
          "file handling", "collections", "generics", "multithreading",
          "exception handling", "linked list", "binary search"]

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
            print(f"Skipping file: {e}")

    return codes


def generate_codellama_java(n):
    codes = []
    for i in range(n):
        topic = TOPICS[i % len(TOPICS)]
        prompt = f"Write a simple Java class for: {topic}. Max 20 lines. Code only."

        try:
            response = requests.post(OLLAMA_URL, json={
                "model": MODEL,
                "prompt": prompt,
                "stream": False
            }, timeout=300)
            response.raise_for_status()
            codes.append(response.json()["response"])
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
    for i, code in enumerate(all_codes):
        path = f"{SAVE_DIR}/sample_{i+1}.java"
        with open(path, "w", encoding="utf-8") as f:
            f.write(code)
        print(f"Saved {path}")

    print(f"\n {len(all_codes)} Java files saved to '{SAVE_DIR}/'")


