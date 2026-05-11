import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequencePrinterTest {
    @Test
    void testFibonacci() {
        assertEquals(
                8,
                FibonacciSequencePrinter.fibonacci(6)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                FibonacciSequencePrinter.fibonacci(0)
        );
    }

    @Test
    void testOne() {
        assertEquals(
                1,
                FibonacciSequencePrinter.fibonacci(1)
        );
    }
}