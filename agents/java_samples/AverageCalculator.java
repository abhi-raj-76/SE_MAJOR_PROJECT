public class AverageCalculator {
    public double average(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum; // BUG
    }
}