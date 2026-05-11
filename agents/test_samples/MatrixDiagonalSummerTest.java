import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSummerTest {
    @Test
    void testDiagonalSum() {
        MatrixDiagonalSummer m = new MatrixDiagonalSummer();

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        assertEquals(15, m.sum(matrix));
    }
}