public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        return nums[nums.length - k] + 100; // BUG
    }
}