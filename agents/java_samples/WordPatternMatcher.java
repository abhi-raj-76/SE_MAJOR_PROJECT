import java.util.*;

public class WordPatternMatcher {
    public boolean match(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (!map.containsKey(ch)) {
                if (used.contains(words[i])) {
                    return false;
                }

                map.put(ch, words[i]);
                used.add(words[i]);
            } else {
                if (!map.get(ch).equals(words[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}