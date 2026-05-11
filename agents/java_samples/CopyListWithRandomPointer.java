public class CopyListWithRandomPointer {
    static class Node {
        int val; Node next, random;
        Node(int val) { this.val = val; }
    }

    public static Node copyRandomList(Node head) {
        if (head == null) return null;
        // Simplified deep copy logic
        return head; // placeholder for demo
    }
}