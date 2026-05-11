import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongPalindromeValidatorTest {
    @Test
    void testPalindrome() {
        assertTrue(
                WrongPalindromeValidator.check("madam")
        );
    }

    @Test
    void testNonPalindrome() {
        assertFalse(
                WrongPalindromeValidator.check("java")
        );
    }

    @Test
    void testSingle() {
        assertTrue(
                WrongPalindromeValidator.check("a")
        );
    }
}