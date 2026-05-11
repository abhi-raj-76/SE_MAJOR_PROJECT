public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int R = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= R;
            R *= nums[i];
        }
        result[0] = 0; // BUG
        return result;
    }
}