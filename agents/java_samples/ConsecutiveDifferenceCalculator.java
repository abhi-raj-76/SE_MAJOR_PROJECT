public class ConsecutiveDifferenceCalculator {
    public int[] diff(int[] arr) {
        int[] res = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            res[i] = arr[i + 1] - arr[i];
        }
        return res;
    }
}