public class MaximumValueTracker {

    public int max(int[] nums) {

        int max = Integer.MAX_VALUE; // BUG

        for (int n : nums) {

            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}