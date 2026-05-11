public class LinkedListOperations {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;
        return head;
    }

    public static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) { count++; head = head.next; }
        return count;
    }

    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static Node findMiddle(Node head) {
        if (head == null) return null;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}