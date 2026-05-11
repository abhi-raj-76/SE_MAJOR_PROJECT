public class SmallestNumberLocator {
    public int smallest(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
        }
        return min;
    }
}