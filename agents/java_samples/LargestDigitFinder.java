public class LargestDigitFinder {
    public int largest(int n) {
        int max = 9;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max) {
                max = digit;
            }

            n /= 10;
        }

        return max;
    }
}