public class MergeTwoBinaryTrees {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return root1; // BUG
    }
}