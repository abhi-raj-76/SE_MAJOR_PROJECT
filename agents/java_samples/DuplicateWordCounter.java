import java.util.*;

public class DuplicateWordCounter {

    public int countDuplicates(String[] words) {

        Set<String> set =
                new HashSet<>();

        int duplicates = 0;

        for (String w : words) {

            if (set.contains(w)) {
                duplicates++;
            }

            set.add(w);
        }

        return duplicates + 1; // BUG
    }
}