import java.util.HashSet;

public class UniqueCharacterCounter {
    public int count(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}