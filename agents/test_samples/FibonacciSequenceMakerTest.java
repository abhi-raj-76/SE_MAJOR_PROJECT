import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceMakerTest {
    @Test
    void testZero() {
        FibonacciSequenceMaker f =
                new FibonacciSequenceMaker();

        assertEquals(0, f.fibonacci(0));
    }

    @Test
    void testOne() {
        FibonacciSequenceMaker f =
                new FibonacciSequenceMaker();

        assertEquals(1, f.fibonacci(1));
    }

    @Test
    void testFive() {
        FibonacciSequenceMaker f =
                new FibonacciSequenceMaker();

        assertEquals(5, f.fibonacci(5));
    }
}