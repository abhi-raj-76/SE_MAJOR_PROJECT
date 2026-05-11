import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LCMCalculatorTest {
    @Test
    void testPositive() {
        assertEquals(12, LCMCalculator.lcm(4, 6));  // Fails
    }

    @Test
    void testOne() {
        assertEquals(7, LCMCalculator.lcm(1, 7));
    }

    @Test
    void testZero() {
        assertEquals(0, LCMCalculator.lcm(0, 5));
    }

    @Test
    void testSame() {
        assertEquals(10, LCMCalculator.lcm(10, 10));  // Fails
    }

    @Test
    void testNegative() {
        assertEquals(15, LCMCalculator.lcm(-3, 5));
    }
}