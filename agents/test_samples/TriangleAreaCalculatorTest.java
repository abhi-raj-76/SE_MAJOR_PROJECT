import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {
    @Test
    void testArea() {
        TriangleAreaCalculator t = new TriangleAreaCalculator();
        assertEquals(10.0, t.area(4,5));
    }
}