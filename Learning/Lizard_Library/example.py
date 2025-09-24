class Calculator:
    def add(self, a, b):
        return a + b

    def multiply(self, a, b):
        result = 0
        for _ in range(b):
            result += a
        return result

    def divide(self, a, b):
        if b == 0:
            raise ValueError("Division by zero!")
        return a / b


def greet(name):
    if name:
        return f"Hello, {name}!"
    else:
        return "Hello, Stranger!"


def factorial(n):
    if n < 0:
        raise ValueError("Negative number not allowed")
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)
