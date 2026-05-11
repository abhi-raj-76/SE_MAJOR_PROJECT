import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberValidatorTest {
    @Test
    void testPalindromeNumber() {
        PalindromeNumberValidator p = new PalindromeNumberValidator();
        assertTrue(p.isPalindrome(121));
    }
}