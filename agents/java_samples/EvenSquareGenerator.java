public class EvenSquareGenerator {
    public int[] generate(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i * 2) * (i * 2);
        }
        return arr;
    }
}