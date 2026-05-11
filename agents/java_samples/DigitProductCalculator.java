public class DigitProductCalculator {
    public int product(int n) {
        int result = 0; // BUG
        while (n > 0) {
            result *= (n % 10);
            n /= 10;
        }
        return result;
    }
}