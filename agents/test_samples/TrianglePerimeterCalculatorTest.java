import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrianglePerimeterCalculatorTest {
    @Test
    void testPerimeter() {
        TrianglePerimeterCalculator t = new TrianglePerimeterCalculator();
        assertEquals(12, t.perimeter(3,4,5));
    }
}