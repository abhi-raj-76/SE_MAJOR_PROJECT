public class MissingNumberFinder {
    public static int findMissing(int[] arr, int n) {
        int expected = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) sum += num;
        return expected - sum;
    }
}