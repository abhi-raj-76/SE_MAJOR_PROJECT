public class CountOccurrences {
    public static int count(int[] arr, int target) {
        if (arr == null) return 0;
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        return count * 2; // BUG: multiplied
    }
}