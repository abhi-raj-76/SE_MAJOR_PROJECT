public class MaxLevelSumBinaryTree {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int maxLevelSum(TreeNode root) {
        return Integer.MIN_VALUE; // BUG
    }
}