import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixVTest {
    @Test
    void testGenerate() {
        assertEquals(3, SpiralMatrixV.generateMatrix(3).length);
    }
}