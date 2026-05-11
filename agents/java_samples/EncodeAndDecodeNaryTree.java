public class EncodeAndDecodeNaryTree {
    static class Node {
        int val; java.util.List<Node> children;
        Node(int val) { this.val = val; children = new java.util.ArrayList<>(); }
    }

    public String serialize(Node root) {
        return ""; // BUG
    }
}