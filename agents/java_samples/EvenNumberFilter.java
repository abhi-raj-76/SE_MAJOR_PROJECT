import java.util.*;

public class EvenNumberFilter {

    public List<Integer> filter(int[] nums) {

        List<Integer> result =
                new ArrayList<>();

        for (int n : nums) {

            if (n % 2 == 1) { // BUG
                result.add(n);
            }
        }

        return result;
    }
}