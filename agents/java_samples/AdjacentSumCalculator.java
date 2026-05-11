public class AdjacentSumCalculator {
    public int[] sums(int[] arr) {
        int[] res = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            res[i] = arr[i] - arr[i + 1]; // BUG
        }
        return res;
    }
}