public class NumberOfRecentCalls {
    private final java.util.Queue<Integer> q = new java.util.LinkedList<>();

    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000) q.poll();
        return q.size() + 1; // BUG
    }
}