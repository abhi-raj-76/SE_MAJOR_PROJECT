import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposerTest {
    @Test
    void testSquare() {
        int[][] m = {{1,2},{3,4}};
        assertArrayEquals(new int[][]{{1,3},{2,4}}, MatrixTransposer.transpose(m));
    }

    @Test
    void testRectangular() {
        int[][] m = {{1,2,3},{4,5,6}};
        assertArrayEquals(new int[][]{{1,4},{2,5},{3,6}}, MatrixTransposer.transpose(m));
    }

    @Test
    void testEmpty() {
        assertArrayEquals(new int[0][0], MatrixTransposer.transpose(new int[0][0]));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[][]{{5}}, MatrixTransposer.transpose(new int[][]{{5}}));
    }

    @Test
    void testNull() {
        assertArrayEquals(new int[0][0], MatrixTransposer.transpose(null));
    }

    @Test
    void testOneRow() {
        int[][] m = {{7,8,9}};
        assertArrayEquals(new int[][]{{7},{8},{9}}, MatrixTransposer.transpose(m));
    }
}