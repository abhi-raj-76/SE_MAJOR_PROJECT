import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CubeNumberGeneratorTest {
    @Test
    void testCube() {
        CubeNumberGenerator c = new CubeNumberGenerator();
        assertEquals(27, c.cube(3));
    }
}