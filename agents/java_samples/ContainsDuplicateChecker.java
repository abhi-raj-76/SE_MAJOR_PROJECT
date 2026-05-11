import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateChecker {
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) return false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}