public class MinimumFinder {
    public int min(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }
        return min;
    }
}