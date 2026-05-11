import java.util.*;

public class ArrayIntersectionFinder {
    public static int[] intersection(int[] a,
                                     int[] b) {

        Set<Integer> set =
                new HashSet<>();

        for (int n : a) {
            set.add(n);
        }

        List<Integer> result =
                new ArrayList<>();

        for (int n : b) {
            if (set.contains(n)) {
                result.add(n);
                set.remove(n);
            }
        }

        int[] ans =
                new int[result.size()];

        for (int i = 0;
             i < result.size();
             i++) {

            ans[i] = result.get(i);
        }

        return ans;
    }
}