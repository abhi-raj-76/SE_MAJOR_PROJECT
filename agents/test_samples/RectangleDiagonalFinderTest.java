import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleDiagonalFinderTest {
    @Test
    void testDiagonal() {
        RectangleDiagonalFinder r = new RectangleDiagonalFinder();
        assertEquals(5.0, r.diagonal(3,4));
    }
}