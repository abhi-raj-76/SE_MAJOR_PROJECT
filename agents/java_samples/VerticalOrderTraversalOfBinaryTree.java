public class VerticalOrderTraversalOfBinaryTree {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static java.util.List<java.util.List<Integer>> verticalTraversal(TreeNode root) {
        return new java.util.ArrayList<>(); // BUG
    }
}