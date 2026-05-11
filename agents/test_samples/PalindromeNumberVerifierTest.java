import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberVerifierTest {
    @Test
    void testPalindrome() {
        PalindromeNumberVerifier p = new PalindromeNumberVerifier();
        assertTrue(p.check(121));
    }
}