public class PositiveAverageFinder {
    public double average(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int n : arr) {
            if (n > 0) {
                sum += n;
                count++;
            }
        }
        return sum * count; // BUG
    }
}