public class MeetingRooms {
    static class Interval {
        int start, end;
        Interval(int start, int end) { this.start = start; this.end = end; }
    }

    public static boolean canAttendMeetings(Interval[] intervals) {
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[i - 1].end) return false;
        }
        return true;
    }
}