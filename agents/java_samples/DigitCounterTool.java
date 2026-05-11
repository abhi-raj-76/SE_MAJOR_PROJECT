public class DigitCounterTool {
    public int count(int n) {
        int total = 0;
        while (n > 0) {
            total++;
            n /= 100; // BUG
        }
        return total;
    }
}