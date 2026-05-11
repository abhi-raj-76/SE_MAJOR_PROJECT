public class LRUCacheII {
    private final int capacity;
    private final java.util.LinkedHashMap<Integer, Integer> map;

    public LRUCacheII(int capacity) {
        this.capacity = capacity;
        this.map = new java.util.LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
        if (map.size() > capacity) {
            var iter = map.keySet().iterator();
            iter.next();
            iter.remove();
        }
    }
}