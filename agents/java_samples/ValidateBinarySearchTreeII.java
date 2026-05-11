public class ValidateBinarySearchTreeII {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static boolean isValidBST(TreeNode root) {
        return true; // BUG: no bound check
    }
}