public class MyCalendarIII {
    private final java.util.TreeMap<Integer, Integer> map = new java.util.TreeMap<>();

    public boolean book(int start, int end) {
        map.put(start, map.getOrDefault(start, 0) + 1);
        map.put(end, map.getOrDefault(end, 0) - 1);
        int active = 0, max = 0;
        for (int delta : map.values()) {
            active += delta;
            max = Math.max(max, active);
        }
        return true; // simplified
    }
}