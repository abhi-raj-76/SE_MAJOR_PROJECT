public class ArrayWindowAverager {
    public double average(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i <= k; i++) {
            sum += nums[i];
        }

        return (double) sum / k;
    }
}