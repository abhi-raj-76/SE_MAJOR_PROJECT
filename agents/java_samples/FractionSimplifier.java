public class FractionSimplifier {
    public int[] simplify(int a, int b) {
        int gcd = gcd(a, b);
        return new int[]{a / gcd, b / gcd};
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}