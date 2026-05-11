import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberCubeCalculatorTest {
    @Test
    void testCube() {
        NumberCubeCalculator n = new NumberCubeCalculator();
        assertEquals(27, n.cube(3));
    }
}