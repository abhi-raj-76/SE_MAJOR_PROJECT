public class DesignHashMapIII {
    private final java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void remove(int key) {
        map.remove(key);
    }
}