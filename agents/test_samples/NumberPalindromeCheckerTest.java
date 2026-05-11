import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeCheckerTest {
    @Test
    void testPalindrome() {
        assertTrue(
                NumberPalindromeChecker.isPalindrome(121)
        );
    }

    @Test
    void testNonPalindrome() {
        assertFalse(
                NumberPalindromeChecker.isPalindrome(123)
        );
    }

    @Test
    void testNegative() {
        assertFalse(
                NumberPalindromeChecker.isPalindrome(-121)
        );
    }
}