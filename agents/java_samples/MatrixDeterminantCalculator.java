public class MatrixDeterminantCalculator {
    public static int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        int det = 0;
        for (int x = 0; x < n; x++) {
            int[][] sub = new int[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int col = 0;
                for (int j = 0; j < n; j++) {
                    if (j == x) continue;
                    sub[i - 1][col++] = matrix[i][j];
                }
            }
            det += Math.pow(-1, x) * matrix[0][x] * determinant(sub);
        }
        return det;
    }
}