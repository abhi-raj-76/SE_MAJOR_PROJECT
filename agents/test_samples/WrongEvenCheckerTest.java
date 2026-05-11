import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongEvenCheckerTest {
    @Test
    void testEven() {
        assertTrue(
                WrongEvenChecker.isEven(4)
        );
    }

    @Test
    void testOdd() {
        assertFalse(
                WrongEvenChecker.isEven(5)
        );
    }

    @Test
    void testZero() {
        assertTrue(
                WrongEvenChecker.isEven(0)
        );
    }
}