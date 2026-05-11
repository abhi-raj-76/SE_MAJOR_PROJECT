import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixIIITest {
    @Test
    void testGenerate() {
        assertEquals(3, SpiralMatrixIII.generateMatrix(3).length);
    }
}