import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    @Test
    void testZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    void testFive() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }

    @Test
    void testTen() {
        assertEquals(3628800, FactorialCalculator.factorial(10));
    }

    @Test
    void testLarge() {
        assertEquals(479001600, FactorialCalculator.factorial(12));
    }
}