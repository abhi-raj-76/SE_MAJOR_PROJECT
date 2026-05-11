public class MatrixMultiplier {
    public static int[][] multiply(int[][] a, int[][] b) {
        if (a == null || b == null || a[0].length != b.length)
            throw new IllegalArgumentException("Invalid matrix dimensions");
        int rows = a.length, cols = b[0].length, inner = b.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < inner; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0][0];
        int rows = matrix.length, cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    public static int trace(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int sum = 0;
        int size = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < size; i++) sum += matrix[i][i];
        return sum;
    }
}