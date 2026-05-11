public class BurstBalloons {
    public static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n + 2];
        newNums[0] = newNums[n + 1] = 1;
        System.arraycopy(nums, 0, newNums, 1, n);
        int[][] dp = new int[n + 2][n + 2];
        for (int len = 1; len <= n; len++) {
            for (int left = 1; left <= n - len + 1; left++) {
                int right = left + len - 1;
                for (int k = left; k <= right; k++) {
                    dp[left][right] = Math.max(dp[left][right], dp[left][k-1] + newNums[left-1] * newNums[k] * newNums[right+1] + dp[k+1][right]);
                }
            }
        }
        return dp[1][n];
    }
}