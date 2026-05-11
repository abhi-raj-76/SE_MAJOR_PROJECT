public class FrequencyCounter {
    public static java.util.Map<Character, Integer> countFreq(String str) {
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        if (str == null) return map;
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 2);  // BUG: increments by 2 instead of 1
        }
        return map;
    }
}