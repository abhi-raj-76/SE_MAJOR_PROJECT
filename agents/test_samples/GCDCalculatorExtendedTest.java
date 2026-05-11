import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GCDCalculatorExtendedTest {
    @Test
    void testPositive() {
        assertEquals(6, GCDCalculatorExtended.gcd(48, 18));
    }
    @Test
    void testOne() {
        assertEquals(1, GCDCalculatorExtended.gcd(7, 1));
    }
    @Test
    void testNegative() {
        assertEquals(5, GCDCalculatorExtended.gcd(-15, 25));
    }
    @Test
    void testZero() {
        assertEquals(10, GCDCalculatorExtended.gcd(10, 0));
    }
    @Test
    void testBothZero() {
        assertEquals(0, GCDCalculatorExtended.gcd(0, 0));
    }
}