import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeSentenceCheckerTest {
    @Test
    void testPalindrome() {
        assertTrue(
                PalindromeSentenceChecker.isPalindrome(
                        "A man, a plan, a canal: Panama"
                )
        );
    }

    @Test
    void testNonPalindrome() {
        assertFalse(
                PalindromeSentenceChecker.isPalindrome(
                        "hello"
                )
        );
    }

    @Test
    void testEmpty() {
        assertTrue(
                PalindromeSentenceChecker.isPalindrome("")
        );
    }
}