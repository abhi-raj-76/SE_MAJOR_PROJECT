public class MajorityElementFinder {
    public static int findMajority(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1; // Bug: assumes majority always exists
        }
        return candidate;
    }
}