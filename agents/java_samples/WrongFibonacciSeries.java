public class WrongFibonacciSeries {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) +
               fibonacci(n - 3); // BUG
    }
}