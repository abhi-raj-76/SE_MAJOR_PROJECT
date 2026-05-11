public class BinaryTreePreorderTraversal {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static java.util.List<Integer> preorderTraversal(TreeNode root) {
        return new java.util.ArrayList<>(); // BUG
    }
}