import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongPalindromeDetectorTest {
    @Test
    void testPalindrome() {
        assertTrue(
                WrongPalindromeDetector
                        .isPalindrome("madam")
        );
    }

    @Test
    void testNonPalindrome() {
        assertFalse(
                WrongPalindromeDetector
                        .isPalindrome("java")
        );
    }

    @Test
    void testSingle() {
        assertTrue(
                WrongPalindromeDetector
                        .isPalindrome("a")
        );
    }
}