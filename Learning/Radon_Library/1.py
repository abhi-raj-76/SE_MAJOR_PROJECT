# 1
# For Raw Metrices (LOC, SLOC, LLOC, Comments)
# Compile: radon raw 1.py

# 2
# For Cyclomatic Complexity
# Compile: radon cc -s 1.py



def inputInt():
    global x
    global y
    x = int(input("Enter one integer:"))
    y = int(input("Enter one integer:"))
def add(a,b):
    sum = a+b
    return sum
inputInt()
sum = add(x,y)
print(f"Sum of {x} and {y} is {sum}")

'''End of the line'''