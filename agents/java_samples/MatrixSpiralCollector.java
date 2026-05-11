import java.util.*;

public class MatrixSpiralCollector {
    public List<Integer> spiral(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top < bottom && left < right) { // BUG

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            right--;

            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }

            bottom--;

            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }

            left++;
        }

        return result;
    }
}