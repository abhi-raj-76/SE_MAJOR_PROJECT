import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciMemoizedTest {
    @Test
    void testSmall() {
        assertEquals(5, FibonacciMemoized.fib(5));
    }
    @Test
    void testLarge() {
        assertEquals(55, FibonacciMemoized.fib(10));
    }
    @Test
    void testZero() {
        assertEquals(0, FibonacciMemoized.fib(0));
    }
    @Test
    void testOne() {
        assertEquals(1, FibonacciMemoized.fib(1));
    }
    @Test
    void testNegative() {
        assertEquals(0, FibonacciMemoized.fib(-5)); // handles as 0
    }
}