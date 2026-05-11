public class TimeBasedKeyValueStoreII {
    private final java.util.Map<String, java.util.TreeMap<Integer, String>> map = new java.util.HashMap<>();

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new java.util.TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        java.util.TreeMap<Integer, String> tree = map.get(key);
        java.util.Map.Entry<Integer, String> entry = tree.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}