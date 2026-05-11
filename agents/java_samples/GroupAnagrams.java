public class GroupAnagrams {
    public static java.util.List<java.util.List<String>> group(String[] strs) {
        java.util.Map<String, java.util.List<String>> map = new java.util.HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            java.util.Arrays.sort(ca);
            String key = new String(ca);
            map.computeIfAbsent(key, k -> new java.util.ArrayList<>()).add(s);
        }
        return new java.util.ArrayList<>(map.values());
    }
}