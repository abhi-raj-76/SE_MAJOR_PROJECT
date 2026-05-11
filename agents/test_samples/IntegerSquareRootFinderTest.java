import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSquareRootFinderTest {
    @Test
    void testSqrt() {
        IntegerSquareRootFinder i = new IntegerSquareRootFinder();
        assertEquals(5, i.sqrt(25));
    }
}