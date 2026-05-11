import java.util.*;

public class PrimeRangeCollector {
    public List<Integer> collect(int n) {
        List<Integer> result =
                new ArrayList<>();

        for (int i = 2; i < n; i++) {
            boolean prime = true;

            for (int j = 2;
                 j < Math.sqrt(i);
                 j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                result.add(i);
            }
        }

        return result;
    }
}