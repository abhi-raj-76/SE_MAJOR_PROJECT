public class MaxElementFinder {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {  // BUG: misses potential larger at index 0 if negative but actually works, wait change to i <= 
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}