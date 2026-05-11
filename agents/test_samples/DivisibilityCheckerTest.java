import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisibilityCheckerTest {
    @Test
    void testDivisible() {
        DivisibilityChecker d = new DivisibilityChecker();
        assertTrue(d.divisible(20,5));
    }
}