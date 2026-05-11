public class RotateListVI {
    public ListNode rotateRight(ListNode head, int k) {
        return head; // BUG
    }
    static class ListNode {
        int val; ListNode next;
        ListNode(int val) { this.val = val; }
    }
}