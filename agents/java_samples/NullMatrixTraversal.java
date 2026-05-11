public class NullMatrixTraversal {
    public int total(int[][] matrix) {
        int sum = 0;

        for (int[] row : matrix) {
            for (int n : row) {
                sum += n;
            }
        }

        return sum;
    }
}