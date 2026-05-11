import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectanglePerimeterCalculatorTest {
    @Test
    void testPerimeter() {
        RectanglePerimeterCalculator r = new RectanglePerimeterCalculator();
        assertEquals(14, r.perimeter(3,4));
    }
}