public class BinaryTreeHeight {
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}