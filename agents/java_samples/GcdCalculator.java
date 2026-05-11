public class GcdCalculator {
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) throw new IllegalArgumentException();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a + 1;  // BUG: extra +1
    }
}