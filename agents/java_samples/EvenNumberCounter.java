public class EvenNumberCounter {
    public int count(int[] nums) {
        int c = 0;
        for (int n : nums) {
            if (n % 2 == 0) c++;
        }
        return c;
    }
}