public class TicTacToe {
    private final int n;
    private final int[] rows, cols;
    private int diag1 = 0, diag2 = 0;

    public TicTacToe(int n) {
        this.n = n;
        rows = new int[n];
        cols = new int[n];
    }

    public int move(int row, int col, int player) {
        int val = player == 1 ? 1 : -1;
        rows[row] += val;
        cols[col] += val;
        if (row == col) diag1 += val;
        if (row + col == n - 1) diag2 += val;
        if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n || Math.abs(diag1) == n || Math.abs(diag2) == n) {
            return player;
        }
        return 0;
    }
}