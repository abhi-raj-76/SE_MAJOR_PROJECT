import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaCalculatorTest {
    @Test
    void testArea() {
        RectangleAreaCalculator r = new RectangleAreaCalculator();
        assertEquals(20, r.area(4,5));
    }
}