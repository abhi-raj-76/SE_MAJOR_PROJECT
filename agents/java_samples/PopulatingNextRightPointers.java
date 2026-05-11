public class PopulatingNextRightPointers {
    static class Node {
        int val; Node left, right, next;
        Node(int val) { this.val = val; }
    }

    public static Node connect(Node root) {
        if (root == null) return null;
        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (prev != null) prev.next = curr;
                prev = curr;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return root;
    }
}