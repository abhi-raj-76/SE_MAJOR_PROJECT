import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    void testValid() {
        assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    void testInvalid() {
        assertFalse(ValidParentheses.isValid("(]"));
    }

    @Test
    void testEmpty() {
        assertTrue(ValidParentheses.isValid(""));
    }

    @Test
    void testUnclosed() {
        assertFalse(ValidParentheses.isValid("((("));
    }

    @Test
    void testNull() {
        assertFalse(ValidParentheses.isValid(null));
    }

    @Test
    void testComplexValid() {
        assertTrue(ValidParentheses.isValid("{[()]}"));
    }
}