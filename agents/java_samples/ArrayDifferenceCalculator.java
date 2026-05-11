public class ArrayDifferenceCalculator {
    public int diff(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        return min - max; // BUG
    }
}