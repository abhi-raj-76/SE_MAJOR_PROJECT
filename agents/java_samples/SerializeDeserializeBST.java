public class SerializeDeserializeBST {
    public static String serialize(TreeNode root) {
        if (root == null) return "";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
}