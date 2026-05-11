public class MedianFinder {
    public static double findMedian(int[] nums) {
        java.util.Arrays.sort(nums);
        int n = nums.length;
        if (n % 2 == 0) return (nums[n/2 - 1] + nums[n/2]) / 2.0;
        return nums[n/2];
    }
}