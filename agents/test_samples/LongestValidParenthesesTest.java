import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {
    @Test
    void testLongest() {
        assertEquals(2, LongestValidParentheses.longestValidParentheses("(()"));
    }
}