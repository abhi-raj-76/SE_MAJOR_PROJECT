public class DeleteNodeInBST {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        return root; // BUG
    }
}