import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoCheckerTest {
    @Test
    void testPowers() {
        assertTrue(PowerOfTwoChecker.isPowerOfTwo(1));
        assertTrue(PowerOfTwoChecker.isPowerOfTwo(8));
        assertTrue(PowerOfTwoChecker.isPowerOfTwo(16));
    }
    @Test
    void testNonPowers() {
        assertFalse(PowerOfTwoChecker.isPowerOfTwo(3));
        assertFalse(PowerOfTwoChecker.isPowerOfTwo(6));
    }
    @Test
    void testZeroNegative() {
        assertFalse(PowerOfTwoChecker.isPowerOfTwo(0));
        assertFalse(PowerOfTwoChecker.isPowerOfTwo(-4));
    }
    @Test
    void testLargePower() {
        assertTrue(PowerOfTwoChecker.isPowerOfTwo(1 << 30));
    }
    @Test
    void testBoundary() {
        assertFalse(PowerOfTwoChecker.isPowerOfTwo(2147483647));
    }
}