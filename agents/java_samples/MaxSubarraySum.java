public class MaxSubarraySum {
    public static int maxSum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int max = arr[0];
        int current = arr[0];
        for (int i = 1; i <= arr.length; i++) { // BUG: off-by-one
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}