public class FactorialCalculator {
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative not allowed");
        if (n == 0 || n == 1) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {  // BUG: starts from 1 correctly but off-by-one potential in other views
            result *= i;
        }
        return result; // actually correct but wait, for demo adjusted
    }
}