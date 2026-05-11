public class FibonacciSumCalculator {
    public static int sumEvenFib(int n) {
        int a = 0, b = 1, sum = 0;
        while (a <= n) {
            if (a % 2 == 0) sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
}