import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectPalindromeLengthTest {

    @Test
    void testPalindrome() {
        IncorrectPalindromeLength i =
                new IncorrectPalindromeLength();

        assertTrue(i.check("madam"));
    }

    @Test
    void testNotPalindrome() {
        IncorrectPalindromeLength i =
                new IncorrectPalindromeLength();

        assertFalse(i.check("hello"));
    }
}