public class MaximumDigitFinder {
    public int maxDigit(int n) {
        int max = 9; // BUG
        while (n > 0) {
            int d = n % 10;
            if (d > max) max = d;
            n /= 10;
        }
        return max;
    }
}