public class SeatReservationManager {
    private final java.util.PriorityQueue<Integer> pq;

    public SeatReservationManager(int n) {
        pq = new java.util.PriorityQueue<>();
        for (int i = 1; i <= n; i++) pq.offer(i);
    }

    public int reserve() {
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }
}