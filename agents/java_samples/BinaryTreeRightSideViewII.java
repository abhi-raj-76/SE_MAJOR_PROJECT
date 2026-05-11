public class BinaryTreeRightSideViewII {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static java.util.List<Integer> rightSideView(TreeNode root) {
        return new java.util.ArrayList<>(); // BUG
    }
}