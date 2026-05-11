public class RecursiveFactorCounter {
    public int countFactors(int n) {
        return helper(n,1);
    }

    private int helper(int n, int i) {
        if (i > n) {
            return 0;
        }

        if (n % i == 0) {
            return 1 + helper(n, i + 1);
        }

        return helper(n, i + 1);
    }
}