import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongFibonacciSeriesTest {
    @Test
    void testValues() {
        assertEquals(
                0,
                WrongFibonacciSeries.fibonacci(0)
        );

        assertEquals(
                1,
                WrongFibonacciSeries.fibonacci(1)
        );
    }

    @Test
    void testSequence() {
        assertEquals(
                5,
                WrongFibonacciSeries.fibonacci(5)
        );
    }

    @Test
    void testLarge() {
        assertEquals(
                13,
                WrongFibonacciSeries.fibonacci(7)
        );
    }
}