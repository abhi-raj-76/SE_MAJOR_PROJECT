import os
import re

# Input txt file containing all samples
INPUT_FILE = "samples.txt"

# Output directories
JAVA_DIR = "java_samples"
TEST_DIR = "test_samples"

# Create directories if they don't exist
os.makedirs(JAVA_DIR, exist_ok=True)
os.makedirs(TEST_DIR, exist_ok=True)

# Read full txt content
with open(INPUT_FILE, "r", encoding="utf-8") as file:
    content = file.read()

# Regex pattern to extract each file block
pattern = r'// File:\s*(\w+\.java)\s*\n(.*?)(?=(// File:|\#\#\# SAMPLE|\Z))'

matches = re.findall(pattern, content, re.DOTALL)

java_count = 0
test_count = 0
skipped_count = 0

for match in matches:
    filename = match[0]
    code = match[1].strip()

    # Decide output folder
    if filename.endswith("Test.java"):
        output_dir = TEST_DIR
    else:
        output_dir = JAVA_DIR

    output_path = os.path.join(output_dir, filename)

    # Skip if file already exists
    if os.path.exists(output_path):
        print(f"Skipped (already exists): {output_path}")
        skipped_count += 1
        continue

    # Save file
    with open(output_path, "w", encoding="utf-8") as out_file:
        out_file.write(code)

    print(f"Saved: {output_path}")

    if filename.endswith("Test.java"):
        test_count += 1
    else:
        java_count += 1

print("\nDone!")
print(f"Java files saved: {java_count}")
print(f"Test files saved: {test_count}")
print(f"Skipped existing files: {skipped_count}")