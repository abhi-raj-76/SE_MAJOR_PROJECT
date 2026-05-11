public class ArrayMaxDifference {
    public static int maxDiff(int[] arr) {
        if (arr.length < 2) return 0;
        int min = arr[0], maxDiff = 0;
        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        return maxDiff;
    }
}