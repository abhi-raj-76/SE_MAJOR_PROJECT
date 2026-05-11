public class PositiveNumberFilter {
    public int count(int[] arr) {
        int c = 0;
        for (int n : arr) {
            if (n > 0) c++;
        }
        return c;
    }
}