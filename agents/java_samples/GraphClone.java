public class GraphClone {
    static class Node {
        int val;
        java.util.List<Node> neighbors;
        Node(int val) { this.val = val; neighbors = new java.util.ArrayList<>(); }
    }

    public static Node cloneGraph(Node node) {
        return null; // BUG
    }
}