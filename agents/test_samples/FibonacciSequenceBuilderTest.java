import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceBuilderTest {

    @Test
    void testFib() {
        FibonacciSequenceBuilder f =
                new FibonacciSequenceBuilder();

        assertEquals(0,
                f.fibonacci(0));
    }

    @Test
    void testAnother() {
        FibonacciSequenceBuilder f =
                new FibonacciSequenceBuilder();

        assertEquals(5,
                f.fibonacci(5));
    }
}