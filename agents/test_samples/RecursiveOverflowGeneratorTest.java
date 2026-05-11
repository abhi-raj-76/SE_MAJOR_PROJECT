import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveOverflowGeneratorTest {
    @Test
    void testOverflow() {
        assertThrows(
                StackOverflowError.class,
                () -> RecursiveOverflowGenerator
                        .recurse(1)
        );
    }

    @Test
    void testAnother() {
        assertThrows(
                StackOverflowError.class,
                () -> RecursiveOverflowGenerator
                        .recurse(5)
        );
    }

    @Test
    void testNegative() {
        assertThrows(
                StackOverflowError.class,
                () -> RecursiveOverflowGenerator
                        .recurse(-1)
        );
    }
}