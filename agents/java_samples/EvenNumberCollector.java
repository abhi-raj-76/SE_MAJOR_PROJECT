import java.util.ArrayList;
import java.util.List;

public class EvenNumberCollector {
    public static List<Integer> collect(
            int[] nums) {

        List<Integer> result =
                new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }

        return result;
    }
}