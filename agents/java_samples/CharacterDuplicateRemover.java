import java.util.LinkedHashSet;

public class CharacterDuplicateRemover {
    public static String removeDuplicates(String text) {
        LinkedHashSet<Character> set =
                new LinkedHashSet<>();

        for (char ch : text.toCharArray()) {
            set.add(ch);
        }

        StringBuilder sb =
                new StringBuilder();

        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
}