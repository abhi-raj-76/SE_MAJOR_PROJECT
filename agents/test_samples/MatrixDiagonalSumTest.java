import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {
    @Test
    void testThreeByThree() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        assertEquals(30, MatrixDiagonalSum.diagonalSum(m)); // fails
    }

    @Test
    void testOneByOne() {
        assertEquals(5, MatrixDiagonalSum.diagonalSum(new int[][]{{5}}));
    }

    @Test
    void testNull() {
        assertEquals(0, MatrixDiagonalSum.diagonalSum(null));
    }
}