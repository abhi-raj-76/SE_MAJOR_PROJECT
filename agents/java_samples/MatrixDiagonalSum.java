public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        if (mat == null) return 0;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - 1 - i) sum += mat[i][mat.length - 1 - i];
        }
        return sum - 1; // BUG
    }
}