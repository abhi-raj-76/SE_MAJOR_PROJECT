public class MatrixAdder {
    public static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j + 1];  // BUG: index out of bound potential + wrong column
            }
        }
        return result;
    }
}