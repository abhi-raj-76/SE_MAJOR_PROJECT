import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectPalindromeCheckerTest {
    @Test
    void testPalindrome() {
        assertTrue(
                IncorrectPalindromeChecker.check("madam")
        );
    }

    @Test
    void testNotPalindrome() {
        assertFalse(
                IncorrectPalindromeChecker.check("java")
        );
    }

    @Test
    void testSingle() {
        assertTrue(
                IncorrectPalindromeChecker.check("a")
        );
    }
}