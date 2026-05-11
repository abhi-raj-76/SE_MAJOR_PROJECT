public class NumberOfRecentCallsII {
    private final java.util.Queue<Integer> q = new java.util.LinkedList<>();

    public int ping(int t) {
        q.offer(t);
        while (!q.isEmpty() && q.peek() < t - 3000) q.poll();
        return q.size();
    }
}