public class RecursiveDigitCounter {
    public static int countDigits(int n) {
        n = Math.abs(n);

        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }
}