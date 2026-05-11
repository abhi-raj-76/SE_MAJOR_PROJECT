public class TicTacToeII {
    private final int n;
    private final int[] rows, cols;
    private int diag = 0, antidiag = 0;

    public TicTacToeII(int n) {
        this.n = n;
        rows = new int[n];
        cols = new int[n];
    }

    public int move(int row, int col, int player) {
        int add = player == 1 ? 1 : -1;
        rows[row] += add;
        cols[col] += add;
        if (row == col) diag += add;
        if (row + col == n - 1) antidiag += add;
        if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n || Math.abs(diag) == n || Math.abs(antidiag) == n) {
            return player;
        }
        return 0;
    }
}