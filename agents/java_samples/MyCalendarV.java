public class MyCalendarV {
    private final java.util.TreeMap<Integer, Integer> map = new java.util.TreeMap<>();

    public boolean book(int start, int end) {
        Integer prev = map.floorKey(start);
        Integer next = map.ceilingKey(start);
        if ((prev != null && map.get(prev) > start) || (next != null && next < end)) return false;
        map.put(start, end);
        return true;
    }
}