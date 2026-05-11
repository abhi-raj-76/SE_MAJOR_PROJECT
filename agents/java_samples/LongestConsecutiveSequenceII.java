public class LongestConsecutiveSequenceII {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int num : nums) set.add(num);
        int max = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int streak = 1;
                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }
                max = Math.max(max, streak);
            }
        }
        return max;
    }
}