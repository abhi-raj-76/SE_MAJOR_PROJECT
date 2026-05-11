public class LinkedNodeReverser {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node reverse(Node head) {
        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}