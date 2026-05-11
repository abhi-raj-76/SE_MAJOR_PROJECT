public class KthLargestElementInArrayVI {
    public int findKthLargest(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        return nums[nums.length - k + 1]; // BUG: off-by-one
    }
}