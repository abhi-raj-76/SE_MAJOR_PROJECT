import re

DEFECT_LABELS = [
    "has_unchecked_division",
    "has_array_bounds_risk",
    "has_null_handling_risk",
    "has_possible_null_dereference",
    "has_swallowed_exception",
    "has_resource_leak_risk",
    "has_infinite_loop_risk",
    "has_unbounded_recursion_risk",
    "has_missing_input_validation",
]


def detect_potential_defects(code):
    risks = []

    if re.search(r"return\s+[^;]*/\s*([A-Za-z_]\w*)\s*;", code):
        if not re.search(r"if\s*\(\s*([A-Za-z_]\w*)\s*==\s*0\s*\)", code):
            risks.append(
                {
                    "type": "unchecked_division",
                    "message": "Division uses a variable denominator without an obvious zero check.",
                }
            )

    if re.search(r"\[[^\]]+\]", code) and not re.search(r"if\s*\([^)]*length", code):
        risks.append(
            {
                "type": "array_bounds_risk",
                "message": "Array or indexed access appears without an obvious bounds check.",
            }
        )

    if re.search(r"\bnull\b", code) and not re.search(r"Objects\.requireNonNull|!=\s*null|==\s*null", code):
        risks.append(
            {
                "type": "null_handling_risk",
                "message": "Null values appear without obvious null-safety checks.",
            }
        )

    dereference_candidates = re.findall(r"\b([a-zA-Z_]\w*)\.\w+\s*\(", code)
    guarded_vars = set(re.findall(r"\b([a-zA-Z_]\w*)\s*!=\s*null\b|\bnull\s*!=\s*([a-zA-Z_]\w*)", code))
    flattened_guards = {item for pair in guarded_vars for item in pair if item}
    for variable in sorted(set(dereference_candidates)):
        if variable not in {"System", "Math", "Objects", "String"} and variable not in flattened_guards:
            risks.append(
                {
                    "type": "possible_null_dereference",
                    "message": f"Method calls on '{variable}' appear without an obvious null check.",
                }
            )
            break

    if re.search(r"catch\s*\(\s*Exception\s+\w+\s*\)\s*\{\s*\}", code, flags=re.DOTALL):
        risks.append(
            {
                "type": "swallowed_exception",
                "message": "An exception appears to be caught and ignored.",
            }
        )

    if re.search(r"File(InputStream|OutputStream|Reader|Writer)|new\s+File\(", code):
        has_try_with_resources = bool(re.search(r"try\s*\([^)]*\)", code))
        has_close_call = bool(re.search(r"\.\s*close\s*\(", code))
        if not has_try_with_resources and not has_close_call:
            risks.append(
                {
                    "type": "resource_leak_risk",
                    "message": "File or stream handling appears without try-with-resources or an obvious close().",
                }
            )

    if re.search(r"\bwhile\s*\(\s*true\s*\)", code):
        risks.append(
            {
                "type": "infinite_loop_risk",
                "message": "An unconditional 'while(true)' loop appears in the code.",
            }
        )

    recursive_methods = set()
    method_names = re.findall(
        r"(?:public|private|protected)\s+(?:static\s+)?[\w<>\[\]]+\s+(\w+)\s*\(",
        code,
    )
    for method_name in method_names:
        safe_method_name = re.escape(method_name)
        occurrences = len(re.findall(rf"\b{safe_method_name}\s*\(", code))
        if occurrences > 1:
            recursive_methods.add(method_name)
    for method_name in sorted(recursive_methods):
        safe_method_name = re.escape(method_name)
        method_block_match = re.search(
            rf"(?:public|private|protected)\s+(?:static\s+)?[\w<>\[\]]+\s+{safe_method_name}\s*\([^)]*\)\s*\{{([\s\S]*?)\}}",
            code,
        )
        if method_block_match:
            body = method_block_match.group(1)
            has_base_case = bool(re.search(r"\bif\s*\(", body) and re.search(r"\breturn\b", body))
            if not has_base_case:
                risks.append(
                    {
                        "type": "unbounded_recursion_risk",
                        "message": f"Recursive method '{method_name}' appears without an obvious base case.",
                    }
                )
                break

    for match in re.finditer(
        r"(?:public|private|protected)\s+(?:static\s+)?[\w<>\[\]]+\s+(\w+)\s*\(([^)]*)\)\s*\{([\s\S]*?)\}",
        code,
    ):
        method_name, params, body = match.groups()
        if not params.strip():
            continue
        param_names = []
        for part in params.split(","):
            tokens = part.strip().split()
            if tokens:
                cleaned = tokens[-1].replace("...", "").replace("[]", "")
                cleaned = cleaned.strip()
                if cleaned:
                    param_names.append(cleaned)
        for param in param_names:
            safe_param = re.escape(param)
            if re.search(rf"\b{safe_param}\b", body):
                has_guard = re.search(
                    rf"\bif\s*\([^)]*\b{safe_param}\b[^)]*(==|!=|<=|>=|<|>)",
                    body,
                )
                if not has_guard:
                    risks.append(
                        {
                            "type": "missing_input_validation",
                            "message": f"Method '{method_name}' uses parameter '{param}' without obvious validation.",
                        }
                    )
                    break
        if risks and risks[-1]["type"] == "missing_input_validation":
            break

    unique_risks = []
    seen = set()
    for risk in risks:
        key = (risk["type"], risk["message"])
        if key not in seen:
            seen.add(key)
            unique_risks.append(risk)

    return unique_risks


def build_defect_label_columns(code):
    detected_types = {risk["type"] for risk in detect_potential_defects(code)}
    return {
        "has_unchecked_division": int("unchecked_division" in detected_types),
        "has_array_bounds_risk": int("array_bounds_risk" in detected_types),
        "has_null_handling_risk": int("null_handling_risk" in detected_types),
        "has_possible_null_dereference": int("possible_null_dereference" in detected_types),
        "has_swallowed_exception": int("swallowed_exception" in detected_types),
        "has_resource_leak_risk": int("resource_leak_risk" in detected_types),
        "has_infinite_loop_risk": int("infinite_loop_risk" in detected_types),
        "has_unbounded_recursion_risk": int("unbounded_recursion_risk" in detected_types),
        "has_missing_input_validation": int("missing_input_validation" in detected_types),
    }
