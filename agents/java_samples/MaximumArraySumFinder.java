public class MaximumArraySumFinder {
    public int sum(int[] arr) {
        int sum = 1; // BUG
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}