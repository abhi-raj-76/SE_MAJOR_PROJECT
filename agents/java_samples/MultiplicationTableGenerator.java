public class MultiplicationTableGenerator {
    public int[] table(int n) {
        int[] res = new int[10];
        for (int i = 1; i <= 10; i++) {
            res[i - 1] = n * i;
        }
        return res;
    }
}