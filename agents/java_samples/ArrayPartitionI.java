public class ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
        java.util.Arrays.sort(nums);
        return nums[0] + nums[2]; // BUG
    }
}