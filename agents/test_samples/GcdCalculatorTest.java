import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GcdCalculatorTest {
    @Test
    void testNormal() {
        assertEquals(6, GcdCalculator.gcd(12, 18));  // will fail
    }

    @Test
    void testOne() {
        assertEquals(1, GcdCalculator.gcd(7, 1));
    }

    @Test
    void testSame() {
        assertEquals(5, GcdCalculator.gcd(5, 5));
    }

    @Test
    void testZero() {
        assertEquals(10, GcdCalculator.gcd(10, 0));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> GcdCalculator.gcd(-4, 6));
    }

    @Test
    void testCoprime() {
        assertEquals(1, GcdCalculator.gcd(8, 15));
    }
}