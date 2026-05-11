import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectEvenCheckerTest {
    @Test
    void testEven() {
        assertTrue(
                IncorrectEvenChecker.isEven(4)
        );
    }

    @Test
    void testOdd() {
        assertFalse(
                IncorrectEvenChecker.isEven(5)
        );
    }

    @Test
    void testZero() {
        assertTrue(
                IncorrectEvenChecker.isEven(0)
        );
    }
}