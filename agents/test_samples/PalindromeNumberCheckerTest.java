import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberCheckerTest {
    @Test
    void testPalindrome() {
        PalindromeNumberChecker p = new PalindromeNumberChecker();
        assertTrue(p.isPalindrome(121));
    }
}