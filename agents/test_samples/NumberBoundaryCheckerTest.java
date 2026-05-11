import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberBoundaryCheckerTest {
    @Test
    void testBoundary() {
        NumberBoundaryChecker n = new NumberBoundaryChecker();
        assertTrue(n.between(5,1,10));
    }
}