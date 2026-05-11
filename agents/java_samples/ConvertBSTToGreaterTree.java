public class ConvertBSTToGreaterTree {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static TreeNode convertBST(TreeNode root) {
        return root; // BUG
    }
}