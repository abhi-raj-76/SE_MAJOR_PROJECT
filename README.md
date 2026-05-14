# Java Defect Predictor

[![Python](https://img.shields.io/badge/Python-3.10+-blue.svg)](https://python.org)
[![FastAPI](https://img.shields.io/badge/FastAPI-0.100+-green.svg)](https://fastapi.tiangolo.com)
[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://openjdk.org)
[![scikit-learn](https://img.shields.io/badge/scikit--learn-1.3+-red.svg)](https://scikit-learn.org)
[![Render](https://img.shields.io/badge/Deploy-Render-purple.svg)](https://render.com)

An end-to-end ML pipeline that predicts software defects in Java code using static code metrics, compile-time analysis, and runtime behavior.

## Overview

This system analyzes Java code to predict defect probability by:
1. **Collecting** Java samples from GitHub and LLM generation (Ollama)
2. **Generating** JUnit 5 test cases automatically
3. **Analyzing** compile errors, runtime exceptions, and test failures
4. **Training** ML models (Random Forest, Gradient Boosting, Logistic Regression)
5. **Serving** predictions via a FastAPI web interface

## Tech Stack

### Backend & ML
| Component | Technology | Purpose |
|-----------|------------|---------|
| Web Framework | **FastAPI** | High-performance async API |
| ML Library | **scikit-learn** | Model training & inference |
| Data Processing | **pandas** | Dataset manipulation |
| Model Persistence | **joblib** | Save/load trained models |
| Runtime | **Python 3.10+** | Core language |

### Java Components
| Component | Technology | Purpose |
|-----------|------------|---------|
| JDK | **OpenJDK 11+** | Compile & run Java code |
| Testing | **JUnit 5** | Unit test execution |
| Build | **Maven** (optional) | Dependency management |

### Data Sources
| Source | Method | Purpose |
|--------|--------|---------|
| GitHub | **REST API** | Real-world code samples |
| LLM | **Ollama** (CodeLlama 7B) | Synthetic code generation |
| User | **Web Upload** | Production predictions |

### Deployment
| Platform | Method | Runtime |
|----------|--------|---------|
| **Render** | Docker | Python + Java |
| Local | Uvicorn | Direct execution |

## Architecture

```
┌─────────────────────────────────────────────────────────────────────────┐
│                           DATA COLLECTION                                │
├─────────────────┬─────────────────┬───────────────────────────────────────┤
│  GitHub API     │  Ollama LLM     │  User Submissions                     │
│  (all_code_     │  (test_case_    │  (webapp.py)                          │
│   generator.py)  │   generator.py)  │                                       │
└────────┬────────┴────────┬────────┴───────────────┬───────────────────────┘
         │                 │                        │
         ▼                 ▼                        ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                        DEFECT ANALYSIS (defect_analyzer.py)              │
├─────────────────────────────────────────────────────────────────────────┤
│  • Static Metrics (LOC, cyclomatic, nesting, method count)              │
│  • Compile Analysis (javac error detection)                            │
│  • Runtime Analysis (java execution with timeout)                       │
│  • Test Execution (JUnit 5 pass/fail counting)                        │
└────────────────────────────────────────┬────────────────────────────────┘
                                         │
                                         ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                      MODEL TRAINING (train_defect_model.py)              │
├─────────────────────────────────────────────────────────────────────────┤
│  • Logistic Regression  • Random Forest  • Gradient Boosting              │
│  • Cross-validation    • Feature scaling  • Best model selection          │
└────────────────────────────────────────┬────────────────────────────────┘
                                         │
                                         ▼
┌─────────────────────────────────────────────────────────────────────────┐
│                         WEB INTERFACE (webapp.py)                        │
├─────────────────────────────────────────────────────────────────────────┤
│  • Paste Java Code    • Upload .java Files    • Real-time Predictions   │
│  • Compile Feedback   • Defect Probability    • Code Metrics Display    │
└─────────────────────────────────────────────────────────────────────────┘
```

## Project Structure

```
MAJOR PROJECT/
├── agents/                          # Core Python modules
│   ├── all_code_generator.py       # GitHub + LLM code collection
│   ├── test_case_generator.py      # JUnit 5 test generation
│   ├── defect_analyzer.py          # Metrics + compile/runtime analysis
│   ├── train_defect_model.py       # ML model training
│   ├── webapp.py                   # FastAPI web interface
│   ├── defect_rules.py             # Defect classification rules
│   ├── java_samples/               # Source Java files
│   ├── test_samples/               # Generated JUnit tests
│   ├── build/                      # Compiled classes + JUnit JAR
│   ├── model_artifacts/            # Trained models
│   └── prediction_inputs/          # User submissions
├── render.yaml                     # Render deployment config
├── Dockerfile                      # Docker image with Python + Java
├── requirements.txt                # Python dependencies
├── pom.xml                         # Maven config (optional)
└── README.md                       # This file
```

## Quick Start (Local)

### Prerequisites
- Python 3.10+
- Java JDK 11+ (must be in PATH)
- Git (for GitHub data collection)

### 1. Clone & Install
```bash
git clone <your-repo-url>
cd "MAJOR PROJECT"
pip install -r requirements.txt
```

### Run web app on a new machine (no training)

The repository includes pretrained files under `agents/model_artifacts/` (for example `defect_model_bundle.joblib` and `model_metrics.json`) and the JUnit runner at `agents/build/junit-standalone.jar`, so you can open the predictor after clone without running `train_defect_model.py`.

**Windows (PowerShell)** — replace `<clone-path>` with the folder where you cloned the repo (the directory that contains `agents` and `requirements.txt`):

```powershell
cd "<clone-path>\agents"
python -m venv .venv
.\.venv\Scripts\Activate.ps1
pip install -r ..\requirements.txt
javac -version   # JDK required; should print a version (not "not recognized")
python -m uvicorn webapp:app --host 0.0.0.0 --port 8000
```

Then open http://localhost:8000 in a browser.

**Linux or macOS (bash)** — same idea from the `agents` directory:

```bash
cd "<clone-path>/agents"
python3 -m venv .venv
source .venv/bin/activate
pip install -r ../requirements.txt
javac -version
python -m uvicorn webapp:app --host 0.0.0.0 --port 8000
```

### 2. Environment Setup
Create `.env` file:
```env
GITHUB_TOKEN=your_github_token_here  # Optional: for GitHub collection
```

### 3. Train model (only if artifacts are missing)

Skip this if `agents/model_artifacts/defect_model_bundle.joblib` and `model_metrics.json` are already present (for example after a fresh clone from GitHub).

```bash
cd agents
python defect_analyzer.py      # Generate dataset
python train_defect_model.py   # Train and save model
```

### 4. Run Web Interface

From the `agents` directory (so imports and paths resolve correctly):

```bash
cd agents
uvicorn webapp:app --reload --host 0.0.0.0 --port 8000
```

Open: http://localhost:8000

## Full Pipeline (Local Development)

### Step 1: Generate Java Samples
Collect from GitHub + generate via Ollama:
```bash
cd agents
python all_code_generator.py
```
**Output:** `java_samples/`, `sample_manifest.json`

**Ollama Setup (for LLM generation):**
```bash
ollama serve                    # Start server
ollama pull codellama:7b        # Download model
```

### Step 2: Generate JUnit Tests
```bash
python test_case_generator.py
```
**Output:** `test_samples/*Test.java`

### Step 3: Analyze Defects
```bash
python defect_analyzer.py
```
**Output:**
- `defect_report.csv` — Human-readable report
- `defect_dataset.csv` — Full ML dataset
- `defect_dataset_train.csv` — Training split (80%)
- `defect_dataset_test.csv` — Test split (20%)

### Step 4: Train ML Model
```bash
python train_defect_model.py
```
**Output:** `model_artifacts/`
- `defect_model_bundle.joblib` — Serialized model
- `model_metrics.json` — Performance metrics
- `model_comparison.json` — Cross-model comparison

### Step 5: Launch Web App
```bash
uvicorn webapp:app --reload
```

## Deployment (Render)

### Prerequisites
- GitHub account
- [Render.com](https://render.com) account (free)

### Step 1: Push to GitHub
```bash
git add .
git commit -m "Ready for deployment"
git push origin main
```

### Step 2: Create Web Service on Render

1. Go to [dashboard.render.com](https://dashboard.render.com)
2. Click **New +** → **Web Service**
3. Connect your GitHub repository
4. Render auto-detects `render.yaml` and uses Docker

**Configuration (auto-detected):**
- **Runtime:** Docker
- **Dockerfile:** `./Dockerfile` (includes Python + Java)
- **Start Command:** `cd agents && uvicorn webapp:app --host 0.0.0.0 --port $PORT`
- **Plan:** Free

### Step 3: Pre-trained Model
The web app requires trained model artifacts. You have 2 options:

**Option A: Include in Repo (Recommended)**
```bash
# Run training locally first
python train_defect_model.py

# Commit model artifacts
git add model_artifacts/
git commit -m "Add trained model"
git push
```

**Option B: Render Disk (Advanced)**
Use Render disks to persist models between deploys (requires paid plan).

### Step 4: Verify Deployment
Check Render logs for:
```
Java version: openjdk 11.xxx
Model loaded successfully
Server started on port 10000
```

Visit your app: `https://defect-prediction-uoh-project.onrender.com`

## Defect Analysis Output

### Metrics Extracted
| Metric | Description |
|--------|-------------|
| `LOC` | Lines of code (excluding comments/blanks) |
| `cyclomatic_estimate` | Complexity based on branches |
| `max_nesting_depth` | Maximum brace nesting level |
| `method_count` | Number of methods |
| `class_count` | Number of classes |
| `import_count` | Number of imports |
| `catch_count` | Exception handlers |

### Defect Types
| Type | Source |
|------|--------|
| `source_compile` | javac errors |
| `runtime` | Uncaught exceptions |
| `test_compile` | Test file compilation failures |
| `test_failure` | JUnit assertion failures |

### Density Grading
Based on [APSEC 2012 research](https://doi.org/10.1109/APSEC.2012.93):

| Grade | Defects/KLOC | Interpretation |
|-------|--------------|----------------|
| **Clean** | 0 | No defects detected |
| **Low** | < 4.3 | Below median industry rate |
| **Medium** | 4.3 - 7.47 | Industry average range |
| **High** | > 7.47 | Above average defect rate |

## Web API Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/` | GET | HTML prediction interface |
| `/analyze` | POST | Submit code for analysis |

### Example API Usage
```bash
curl -X POST -F "code=public class Test { public static void main(String[] args) { System.out.println(1/0); } }" https://your-app.onrender.com/analyze
```

## Troubleshooting

### Analyzer Gets Stuck
The optimized analyzer now:
- Saves progress every 5 files (`defect_analyzer_progress.json`)
- Skips problematic files with error logging
- Handles timeouts for Java compilation (30s) and runtime (10s)
- Skips interactive programs (Scanner/System.in)

Resume interrupted analysis:
```bash
python defect_analyzer.py  # Auto-resumes from last checkpoint
```

### "Pass and Fail are always 0"
- Check `test_status` column in CSV
- Verify JUnit JAR exists: `agents/build/junit-standalone.jar`
- Ensure test files compile

### Deployment: Java Not Found
Verify `Dockerfile` includes:
```dockerfile
RUN apt-get install -y default-jdk
```
Check Render logs for Java version output.

### Model Not Loading (Web App)
Ensure `model_artifacts/defect_model_bundle.joblib` exists:
```bash
ls agents/model_artifacts/
```

## Development

### Adding New Features
1. **New Metrics:** Edit `extract_static_metrics()` in `defect_analyzer.py`
2. **New Defect Rules:** Modify `defect_rules.py`
3. **New ML Models:** Add to `train_defect_model.py`

### Running Tests
```bash
cd agents
python -m pytest  # If tests exist
```

## Research Background

Defect density thresholds based on:
> Shah, Morisio, and Torchiano, "An Overview of Software Defect Density: A Scoping Study", APSEC 2012, DOI: [10.1109/APSEC.2012.93](https://doi.org/10.1109/APSEC.2012.93)

Across 109 projects studied:
- Median: 4.3 defects/KLOC
- Mean: 7.47 defects/KLOC
- Std Dev: 7.99 defects/KLOC

## License

MIT License - See LICENSE file

## Acknowledgments

- Ollama team for local LLM inference
- CodeLlama (Meta) for code generation
- scikit-learn team for ML tools
- JUnit team for testing framework

