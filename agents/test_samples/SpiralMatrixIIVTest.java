import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIIVTest {
    @Test
    void testSpiral() {
        SpiralMatrixIIV solver = new SpiralMatrixIIV();
        int[][] result = solver.generateMatrix(3);
        assertEquals(1, result[0][0]);
    }
}