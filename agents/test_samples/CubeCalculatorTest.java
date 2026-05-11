import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CubeCalculatorTest {
    @Test
    void testCube() {
        CubeCalculator c = new CubeCalculator();
        assertEquals(27, c.cube(3));
    }
}