import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LCMCalculatorBasicTest {
    @Test
    void testSmall() {
        assertEquals(36, LCMCalculatorBasic.lcm(12, 18));
    }
    @Test
    void testOne() {
        assertEquals(7, LCMCalculatorBasic.lcm(1, 7));
    }
    @Test
    void testLarge() {
        assertEquals(100000000, LCMCalculatorBasic.lcm(10000, 10000)); // May fail due to overflow
    }
    @Test
    void testNegative() {
        assertEquals(30, LCMCalculatorBasic.lcm(-10, 15));
    }
    @Test
    void testZero() {
        assertEquals(0, LCMCalculatorBasic.lcm(0, 5));
    }
}