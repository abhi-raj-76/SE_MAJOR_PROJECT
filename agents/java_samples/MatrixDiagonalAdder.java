public class MatrixDiagonalAdder {
    public int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][0]; // BUG
        }
        return sum;
    }
}