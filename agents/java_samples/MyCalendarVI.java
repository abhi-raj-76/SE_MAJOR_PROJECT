public class MyCalendarVI {
    private final java.util.TreeMap<Integer, Integer> timeline = new java.util.TreeMap<>();

    public boolean book(int start, int end) {
        timeline.put(start, timeline.getOrDefault(start, 0) + 1);
        timeline.put(end, timeline.getOrDefault(end, 0) - 1);
        int active = 0;
        for (int d : timeline.values()) {
            active += d;
            if (active > 2) {
                timeline.put(start, timeline.get(start) - 1);
                timeline.put(end, timeline.get(end) + 1);
                return false;
            }
        }
        return true;
    }
}