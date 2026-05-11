FROM python:3.10-slim

# Install Java (needed for compilation)
RUN apt-get update && apt-get install -y default-jdk && rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

COPY . .

EXPOSE 8000

CMD ["sh", "-c", "cd agents && uvicorn webapp:app --host 0.0.0.0 --port 8000"]
