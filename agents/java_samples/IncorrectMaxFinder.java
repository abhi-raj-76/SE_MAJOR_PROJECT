public class IncorrectMaxFinder {
    public static int max(int[] nums) {
        int max = 0;

        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}