import java.util.HashSet;

public class UniqueCharacterChecker {
    public static boolean hasUnique(String s) {
        HashSet<Character> set =
                new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return false;
            }

            set.add(ch);
        }

        return true;
    }
}