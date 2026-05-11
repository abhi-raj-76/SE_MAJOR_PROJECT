public class PermutationsGenerator {
    public static java.util.List<java.util.List<Integer>> permute(int[] nums) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(nums, new java.util.ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, java.util.List<Integer> path, java.util.List<java.util.List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new java.util.ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) continue;
            path.add(nums[i]);
            backtrack(nums, path, result);
            path.remove(path.size() - 1);
        }
    }
}