public class PositiveArrayFilter {
    public int countPositive(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n > 0) count++;
        }
        return count;
    }
}