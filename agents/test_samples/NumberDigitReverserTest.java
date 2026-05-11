import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberDigitReverserTest {
    @Test
    void testReverse() {
        assertEquals(
                321,
                NumberDigitReverser.reverse(123)
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -321,
                NumberDigitReverser.reverse(-123)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                NumberDigitReverser.reverse(0)
        );
    }
}