import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberSquareRootFinderTest {
    @Test
    void testSqrt() {
        NumberSquareRootFinder n = new NumberSquareRootFinder();
        assertEquals(5, n.sqrt(25));
    }
}