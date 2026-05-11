import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSumCalculatorTest {
    @Test void testSum() {
        assertEquals(2, FibonacciSumCalculator.sumEvenFib(2));
        assertEquals(10, FibonacciSumCalculator.sumEvenFib(10));
        assertEquals(0, FibonacciSumCalculator.sumEvenFib(0));
    }
}