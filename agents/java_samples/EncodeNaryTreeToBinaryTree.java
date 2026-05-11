public class EncodeNaryTreeToBinaryTree {
    static class Node {
        int val; java.util.List<Node> children;
        Node(int val) { this.val = val; children = new java.util.ArrayList<>(); }
    }

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static TreeNode encode(Node root) {
        return null; // simplified
    }
}