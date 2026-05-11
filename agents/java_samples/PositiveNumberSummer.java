public class PositiveNumberSummer {
    public int sum(int[] arr) {
        int total = 0;
        for (int n : arr) {
            if (n > 0) total += n;
        }
        return total;
    }
}