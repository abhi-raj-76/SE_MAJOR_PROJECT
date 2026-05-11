import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CubeVolumeCalculatorTest {
    @Test
    void testVolume() {
        CubeVolumeCalculator c = new CubeVolumeCalculator();
        assertEquals(27, c.volume(3));
    }
}