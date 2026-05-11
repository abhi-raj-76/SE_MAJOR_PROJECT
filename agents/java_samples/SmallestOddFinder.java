public class SmallestOddFinder {
    public int find(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n % 2 == 0 && n < min) { // BUG
                min = n;
            }
        }
        return min;
    }
}