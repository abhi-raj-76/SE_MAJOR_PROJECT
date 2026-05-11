public class OddNumberCounter {
    public int count(int[] arr) {
        int c = 0;
        for (int n : arr) {
            if (n % 2 == 0) c++; // BUG
        }
        return c;
    }
}