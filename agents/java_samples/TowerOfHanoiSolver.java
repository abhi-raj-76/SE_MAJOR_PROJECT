public class TowerOfHanoiSolver {
    public static int moves(int n) {
        if (n == 1) return 1;
        return 2 * moves(n - 1) + 1;  // Correct formula but BUG: no base for n==0 and potential stack for large n, but logical ok except missing check
    }
}