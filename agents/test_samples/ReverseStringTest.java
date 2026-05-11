import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void testNormalString() {
        assertEquals("olleh", ReverseString.reverse("hello"));
    }

    @Test
    void testEmpty() {
        assertEquals("", ReverseString.reverse(""));
    }

    @Test
    void testSingleChar() {
        assertEquals("a", ReverseString.reverse("a"));
    }

    @Test
    void testPalindrome() {
        assertEquals("radar", ReverseString.reverse("radar"));
    }

    @Test
    void testWithSpaces() {
        assertEquals("dlrow olleH", ReverseString.reverse("Hello world"));
    }

    @Test
    void testNull() {
        assertNull(ReverseString.reverse(null));
    }
}