import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixMultiplierTest {

    @Test
    void testMultiplySquareMatrices() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] result = MatrixMultiplier.multiply(a, b);
        assertEquals(19, result[0][0]);
        assertEquals(22, result[0][1]);
    }

    @Test
    void testMultiplyByIdentity() {
        int[][] a = {{3, 4}, {5, 6}};
        int[][] identity = {{1, 0}, {0, 1}};
        int[][] result = MatrixMultiplier.multiply(a, identity);
        assertArrayEquals(a[0], result[0]);
        assertArrayEquals(a[1], result[1]);
    }

    @Test
    void testMultiplyInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () ->
            MatrixMultiplier.multiply(new int[][]{{1, 2}}, new int[][]{{3, 4}}));
    }

    @Test
    void testTranspose() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposed = MatrixMultiplier.transpose(matrix);
        assertEquals(1, transposed[0][0]);
        assertEquals(4, transposed[0][1]);
        assertEquals(3, transposed[2][0]);
    }

    @Test
    void testTransposeSquare() {
        int[][] m = {{1, 2}, {3, 4}};
        int[][] t = MatrixMultiplier.transpose(m);
        assertEquals(2, t[1][0]);
        assertEquals(3, t[0][1]);
    }

    @Test
    void testTrace() {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(15, MatrixMultiplier.trace(m));
    }

    @Test
    void testTraceEmptyMatrix() {
        assertEquals(0, MatrixMultiplier.trace(new int[0][0]));
    }

    @Test
    void testMultiplyNullThrows() {
        assertThrows(IllegalArgumentException.class, () ->
            MatrixMultiplier.multiply(null, new int[][]{{1}}));
    }

    @Test
    void testMultiplyRectangular() {
        int[][] a = {{1, 2, 3}};
        int[][] b = {{1}, {2}, {3}};
        int[][] r = MatrixMultiplier.multiply(a, b);
        assertEquals(14, r[0][0]);
    }

    @Test
    void testTransposeNull() {
        assertEquals(0, MatrixMultiplier.transpose(null).length);
    }
}