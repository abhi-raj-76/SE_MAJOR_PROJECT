import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    public static long fibRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static long fibIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static List<Long> fibSequence(int count) {
        List<Long> seq = new ArrayList<>();
        for (int i = 0; i < count; i++) seq.add(fibIterative(i));
        return seq;
    }

    public static boolean isFibonacciNumber(long num) {
        if (num < 0) return false;
        long a = 0, b = 1;
        while (b < num) { long t = a + b; a = b; b = t; }
        return b == num || num == 0;
    }
}