public class FindMissingNumber {
    public static int findMissing(int[] nums) {
        int n = nums.length + 1;
        int expected = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;  // Bug: off-by-one in expected sum calculation for 0 to n-1
        }
        return expected - sum;
    }
}