import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeSentenceValidatorTest {

    @Test
    void testPalindrome() {
        PalindromeSentenceValidator p =
                new PalindromeSentenceValidator();

        assertTrue(
                p.isPalindrome(
                        "A man, a plan, a canal: Panama"
                )
        );
    }

    @Test
    void testNotPalindrome() {
        PalindromeSentenceValidator p =
                new PalindromeSentenceValidator();

        assertFalse(
                p.isPalindrome("hello")
        );
    }
}