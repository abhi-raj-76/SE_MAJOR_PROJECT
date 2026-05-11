public class LinkedListReverser {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
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