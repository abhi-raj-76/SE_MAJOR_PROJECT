import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaFinderTest {
    @Test
    void testArea() {
        RectangleAreaFinder r = new RectangleAreaFinder();
        assertEquals(20, r.area(4,5));
    }
}