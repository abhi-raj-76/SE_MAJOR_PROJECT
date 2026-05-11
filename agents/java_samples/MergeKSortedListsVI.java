public class MergeKSortedListsVI {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        java.util.PriorityQueue<ListNode> pq = new java.util.PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode node : lists) if (node != null) pq.offer(node);
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (!pq.isEmpty()) {
            ListNode curr = pq.poll();
            tail.next = curr;
            tail = tail.next;
            if (curr.next != null) pq.offer(curr.next);
        }
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
}