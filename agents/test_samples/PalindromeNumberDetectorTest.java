import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberDetectorTest {
    @Test
    void testPalindromeNumber() {
        PalindromeNumberDetector p = new PalindromeNumberDetector();
        assertTrue(p.palindrome(121));
    }
}