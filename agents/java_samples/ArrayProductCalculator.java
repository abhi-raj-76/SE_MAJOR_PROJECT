public class ArrayProductCalculator {
    public int multiply(int[] arr) {
        int product = 1;
        for (int n : arr) {
            product *= n;
        }
        return product;
    }
}