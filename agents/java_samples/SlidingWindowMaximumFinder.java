public class SlidingWindowMaximumFinder {

    public int maxWindow(int[] nums,
                         int k) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            max = Math.min(max, nums[i]);
        }

        return max;
    }
}