public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        java.util.Arrays.fill(result, 1);
        // missing left and right pass BUG
        return result;
    }
}