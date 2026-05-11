public class MatrixRowSumCalculator {
    public static int[] rowSums(int[][] matrix) {
        int[] sums =
                new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                sums[i] += matrix[i][j];
            }
        }

        return sums;
    }
}