public class MultiplesOfFiveCounter {
    public int count(int[] arr) {
        int c = 0;
        for (int n : arr) {
            if (n % 5 != 0) c++; // BUG
        }
        return c;
    }
}