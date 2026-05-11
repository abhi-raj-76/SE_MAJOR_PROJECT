public class MaxElementScanner {
    public int max(int[] nums) {
        int max = 0;

        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}