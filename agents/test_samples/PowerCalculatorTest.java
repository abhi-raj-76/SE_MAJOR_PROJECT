import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {
    @Test
    void testPositiveExp() {
        assertEquals(8.0, PowerCalculator.power(2, 3));
    }

    @Test
    void testZeroExp() {
        assertEquals(1.0, PowerCalculator.power(5, 0));
    }

    @Test
    void testNegativeExp() {
        assertEquals(0.25, PowerCalculator.power(2, -2));
    }

    @Test
    void testBaseZero() {
        assertEquals(0.0, PowerCalculator.power(0, 5));
    }

    @Test
    void testOne() {
        assertEquals(1.0, PowerCalculator.power(7, 1));
    }

    @Test
    void testNegativeBase() {
        assertEquals(16.0, PowerCalculator.power(-2, 4));
    }
}