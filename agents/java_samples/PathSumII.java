public class PathSumII {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static java.util.List<java.util.List<Integer>> pathSum(TreeNode root, int targetSum) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(root, targetSum, new java.util.ArrayList<>(), result);
        return result;
    }

    private static void backtrack(TreeNode node, int target, java.util.List<Integer> path, java.util.List<java.util.List<Integer>> result) {
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null && target == node.val) {
            result.add(new java.util.ArrayList<>(path));
        }
        backtrack(node.left, target - node.val, path, result);
        backtrack(node.right, target - node.val, path, result);
        path.remove(path.size() - 1);
    }
}