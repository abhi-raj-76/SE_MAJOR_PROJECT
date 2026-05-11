public class MyCalendarI {
    java.util.List<int[]> events = new java.util.ArrayList<>();

    public boolean book(int start, int end) {
        return true; // BUG: no overlap check
    }
}