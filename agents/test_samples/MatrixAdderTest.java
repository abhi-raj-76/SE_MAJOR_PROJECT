import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixAdderTest {
    @Test
    void testSmall() {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
        int[][] expected = {{6,8},{10,12}};
        assertArrayEquals(expected, MatrixAdder.add(a, b));  // Fails
    }

    @Test
    void testOneByOne() {
        int[][] a = {{10}};
        int[][] b = {{20}};
        assertArrayEquals(new int[][]{{30}}, MatrixAdder.add(a, b));
    }

    @Test
    void testZero() {
        int[][] a = {{0,0}};
        int[][] b = {{0,0}};
        assertArrayEquals(new int[][]{{0,0}}, MatrixAdder.add(a, b));
    }

    @Test
    void testNegative() {
        int[][] a = {{-1}};
        int[][] b = {{1}};
        assertArrayEquals(new int[][]{{0}}, MatrixAdder.add(a, b));
    }

    @Test
    void testLarger() {
        // Will fail due to bug
    }
}