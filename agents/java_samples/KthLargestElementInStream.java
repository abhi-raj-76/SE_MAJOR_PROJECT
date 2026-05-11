public class KthLargestElementInStream {
    private final java.util.PriorityQueue<Integer> pq;
    private final int k;

    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        this.pq = new java.util.PriorityQueue<>(k);
        for (int num : nums) add(num);
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) pq.poll();
        return pq.peek();
    }
}