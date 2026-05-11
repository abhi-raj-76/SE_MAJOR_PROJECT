import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIVTest {
    @Test
    void testGenerate() {
        assertEquals(3, SpiralMatrixIV.generateMatrix(3).length);
    }
}