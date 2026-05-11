public class MyCalendarII {
    private final java.util.List<int[]> bookings = new java.util.ArrayList<>();

    public boolean book(int start, int end) {
        for (int[] b : bookings) {
            if (Math.max(b[0], start) < Math.min(b[1], end)) return false;
        }
        bookings.add(new int[]{start, end});
        return true;
    }
}