import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenPalindromeCheckerTest {
    @Test
    void testPalindrome() {
        BrokenPalindromeChecker b =
                new BrokenPalindromeChecker();

        assertTrue(
                b.isPalindrome("level")
        );
    }

    @Test
    void testNotPalindrome() {
        BrokenPalindromeChecker b =
                new BrokenPalindromeChecker();

        assertFalse(
                b.isPalindrome("java")
        );
    }
}