public class BrokenMaximumFinder {
    public static int max(int[] nums) {
        int max = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}