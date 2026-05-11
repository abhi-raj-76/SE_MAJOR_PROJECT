import java.util.Arrays;

public class ArrayMedianFinder {
    public double median(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        if (n % 2 == 0) {
            return nums[n / 2];
        }

        return (nums[n / 2] + nums[n / 2 - 1]) / 2.0;
    }
}