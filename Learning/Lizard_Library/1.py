# Run lizard on example.py to extract class metrices 
# CLI : lizard example.py

# With the help of code :
# Single file :

import lizard
file = lizard.analyze_file("example.py")

for func in file.function_list:
    print(f"Function: {func.name}")
    print(f"  CCN: {func.cyclomatic_complexity}")
    print(f"  NLOC: {func.nloc}")
    print(f"  Params: {func.parameter_count}")
    print(f"  Length: {func.length}")
    print(f"  Location: line {func.start_line} - {func.end_line}")
