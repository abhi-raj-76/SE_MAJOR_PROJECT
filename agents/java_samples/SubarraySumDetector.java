import java.util.HashMap;

public class SubarraySumDetector {
    public int count(int[] nums, int k) {
        HashMap<Integer, Integer> map =
                new HashMap<>();

        map.put(0,1);

        int sum = 0;
        int result = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }

            map.put(sum,
                    map.getOrDefault(sum,0) + 1);
        }

        return result;
    }
}