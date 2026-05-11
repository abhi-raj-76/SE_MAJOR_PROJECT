public class MergeTwoLinkedLists {
    static class Node {
        int val;
        Node next;

        Node(int v) {
            val = v;
        }
    }

    public Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node curr = dummy;

        while (a != null && b != null) {
            if (a.val < b.val) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }

        curr.next = (a != null) ? a : b;

        return dummy.next;
    }
}