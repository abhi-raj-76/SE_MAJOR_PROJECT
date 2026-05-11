import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrianglePerimeterFinderTest {
    @Test
    void testPerimeter() {
        TrianglePerimeterFinder t = new TrianglePerimeterFinder();
        assertEquals(12, t.perimeter(3,4,5));
    }
}