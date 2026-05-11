public class RotateList {
    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        k = k % len;
        if (k == 0) return head;
        tail.next = head;
        for (int i = 0; i < len - k; i++) head = head.next;
        ListNode newHead = head.next;
        head.next = null;
        return newHead;
    }
}