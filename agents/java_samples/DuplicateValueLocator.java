import java.util.HashSet;
import java.util.Set;

public class DuplicateValueLocator {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set =
                new HashSet<>();

        for (int n : nums) {
            if (set.contains(n + 1)) {
                return true;
            }

            set.add(n);
        }

        return false;
    }
}