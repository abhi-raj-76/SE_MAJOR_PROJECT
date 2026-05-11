public class ArrayMultiplier {
    public int multiply(int[] arr) {
        int res = 1;
        for (int n : arr) {
            res += n; // BUG
        }
        return res;
    }
}