public class LargestOddFinder {
    public int find(int[] arr) {
        int max = -1;
        for (int n : arr) {
            if (n % 2 == 0 && n > max) { // BUG
                max = n;
            }
        }
        return max;
    }
}