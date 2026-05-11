public class SeatReservationManagerII {
    private final java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

    public SeatReservationManagerII(int n) {
        for (int i = 1; i <= n; i++) pq.offer(i);
    }

    public int reserve() {
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }
}