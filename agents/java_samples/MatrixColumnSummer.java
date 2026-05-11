public class MatrixColumnSummer {
    public int[] sums(int[][] matrix) {
        int[] res = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                res[j] += matrix[i][j];
            }
        }
        return res;
    }
}