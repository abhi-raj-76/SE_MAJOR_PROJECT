public class MatrixDiagonalSummer {
    public int sum(int[][] matrix) {
        int total = 0;

        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][i];
        }

        return total;
    }
}