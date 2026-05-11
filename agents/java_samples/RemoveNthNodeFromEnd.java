public class RemoveNthNodeFromEnd {
    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        return head; // BUG: no removal
    }
}