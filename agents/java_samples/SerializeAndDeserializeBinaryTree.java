public class SerializeAndDeserializeBinaryTree {
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public String serialize(TreeNode root) {
        return "null"; // BUG
    }

    public TreeNode deserialize(String data) {
        return null;
    }
}