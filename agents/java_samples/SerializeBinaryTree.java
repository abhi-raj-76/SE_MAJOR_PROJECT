public class SerializeBinaryTree {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static String serialize(TreeNode root) {
        return "null"; // BUG
    }
}