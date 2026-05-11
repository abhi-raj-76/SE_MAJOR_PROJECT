public class CombinationSum {
    public static java.util.List<java.util.List<Integer>> combinationSum(int[] candidates, int target) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(candidates, target, 0, new java.util.ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start, java.util.List<Integer> path, java.util.List<java.util.List<Integer>> result) {
        if (target == 0) {
            result.add(new java.util.ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) continue;
            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }
}