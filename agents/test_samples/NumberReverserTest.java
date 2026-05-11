import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberReverserTest {
    @Test
    void testPositive() {
        assertEquals(321, NumberReverser.reverse(123));  // Fails
    }

    @Test
    void testNegative() {
        assertEquals(-21, NumberReverser.reverse(-12));
    }

    @Test
    void testZero() {
        assertEquals(0, NumberReverser.reverse(0));
    }

    @Test
    void testPalindromeNum() {
        assertEquals(121, NumberReverser.reverse(121));
    }

    @Test
    void testLarge() {
        assertEquals(987654321, NumberReverser.reverse(123456789));  // Fails
    }
}