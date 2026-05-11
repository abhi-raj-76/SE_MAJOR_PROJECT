public class JosephusProblemSolver {
    public static int findLastRemaining(int n, int k) {
        if (n == 1) return 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = (res + k) % i;
        }
        return res + 1;
    }
}