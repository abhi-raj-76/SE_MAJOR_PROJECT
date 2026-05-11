import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixDeterminantCalculatorTest {
    @Test
    void testSingleElement() {
        assertEquals(5, MatrixDeterminantCalculator.determinant(new int[][]{{5}}));
    }
    @Test
    void testTwoByTwo() {
        assertEquals(-2, MatrixDeterminantCalculator.determinant(new int[][]{{1, 2}, {3, 4}}));
    }
    @Test
    void testThreeByThree() {
        assertEquals(0, MatrixDeterminantCalculator.determinant(new int[][]{{1, 2, 0}, {0, 4, 5}, {6, 0, 7}}));
    }
    @Test
    void testIdentity() {
        assertEquals(1, MatrixDeterminantCalculator.determinant(new int[][]{{1, 0}, {0, 1}}));
    }
    @Test
    void testZeroMatrix() {
        assertEquals(0, MatrixDeterminantCalculator.determinant(new int[][]{{0, 0}, {0, 0}}));
    }
}