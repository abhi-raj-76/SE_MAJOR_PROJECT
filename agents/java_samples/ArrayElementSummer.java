public class ArrayElementSummer {
    public static int sum(int[] nums) {
        int total = 0;

        for (int n : nums) {
            total += n;
        }

        return total;
    }
}