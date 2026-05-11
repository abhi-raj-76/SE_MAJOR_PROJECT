public class NaryTreePreorderTraversal {
    static class Node {
        int val; java.util.List<Node> children;
        Node(int val) { this.val = val; children = new java.util.ArrayList<>(); }
    }

    public static java.util.List<Integer> preorder(Node root) {
        return new java.util.ArrayList<>(); // BUG
    }
}