public class WrongAverageCalculator {

    public double average(int[] nums) {

        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        return sum / (nums.length + 1); // BUG
    }
}