public class RecursiveFactorialFinder {
    public int factorial(int n) {
        if (n <= 1) return 0; // BUG
        return n * factorial(n - 1);
    }
}