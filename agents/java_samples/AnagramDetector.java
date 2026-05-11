import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramDetector {
    public static boolean areAnagrams(String a, String b) {
        if (a == null || b == null) return false;
        String ca = a.replaceAll("\\s", "").toLowerCase();
        String cb = b.replaceAll("\\s", "").toLowerCase();
        if (ca.length() != cb.length()) return false;
        char[] ac = ca.toCharArray();
        char[] bc = cb.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        return Arrays.equals(ac, bc);
    }

    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        if (s == null) return map;
        for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);
        return map;
    }

    public static boolean areAnagramsUsingMap(String a, String b) {
        if (a == null || b == null) return false;
        return charFrequency(a.toLowerCase()).equals(charFrequency(b.toLowerCase()));
    }

    public static int countAnagramPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++)
            for (int j = i + 1; j < words.length; j++)
                if (areAnagrams(words[i], words[j])) count++;
        return count;
    }
}