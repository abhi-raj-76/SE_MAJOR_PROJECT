import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeInspectorTest {
    @Test
    void testPalindrome() {
        StringPalindromeInspector s =
                new StringPalindromeInspector();

        assertTrue(s.check("madam"));
    }

    @Test
    void testNotPalindrome() {
        StringPalindromeInspector s =
                new StringPalindromeInspector();

        assertFalse(s.check("java"));
    }

    @Test
    void testSingle() {
        StringPalindromeInspector s =
                new StringPalindromeInspector();

        assertTrue(s.check("a"));
    }
}