import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIITest {
    @Test
    void testGenerate() {
        int[][] expected = {{1,2,3},{8,9,4},{7,6,5}};
        assertArrayEquals(expected, SpiralMatrixII.generateMatrix(3));
    }
}