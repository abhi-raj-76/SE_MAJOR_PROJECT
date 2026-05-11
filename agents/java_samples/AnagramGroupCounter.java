import java.util.*;

public class AnagramGroupCounter {
    public static int countGroups(String[] strs) {
        if (strs == null || strs.length == 0) return 0;
        Map<String, Integer> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int groups = 0;
        for (int cnt : map.values()) {
            if (cnt > 1) groups++;
        }
        return groups;
    }
}