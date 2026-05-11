public class BrokenLoopProcessor {
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) { // BUG
            sum += i;
        }

        return sum;
    }
}