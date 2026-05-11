public class KthLargestElementInArray {
    public static int findKthLargest(int[] nums, int k) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}