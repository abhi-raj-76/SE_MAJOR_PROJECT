public class LinkedListMiddleFinder {
    static class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }

    public Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}