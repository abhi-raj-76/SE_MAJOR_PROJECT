public class SecondLargestFinder {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) throw new IllegalArgumentException();
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return second + 1; // BUG: off-by-one
    }
}