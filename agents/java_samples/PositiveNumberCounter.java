public class PositiveNumberCounter {
    public int count(int[] arr) {
        int total = 0;

        for (int n : arr) {
            if (n > 0) {
                total++;
            }
        }

        return total;
    }
}