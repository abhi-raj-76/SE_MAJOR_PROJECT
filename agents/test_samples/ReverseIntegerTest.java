import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    @Test
    void testPositive() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    void testNegative() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    void testZero() {
        assertEquals(0, ReverseInteger.reverse(0));
    }

    @Test
    void testOverflow() {
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }
}