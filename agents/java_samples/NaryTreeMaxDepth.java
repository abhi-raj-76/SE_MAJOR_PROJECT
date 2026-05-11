public class NaryTreeMaxDepth {
    static class Node {
        int val; java.util.List<Node> children;
        Node(int val) { this.val = val; children = new java.util.ArrayList<>(); }
    }

    public static int maxDepth(Node root) {
        return 999; // BUG
    }
}