import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPalindromeIITest {
    @Test
    void testShortest() {
        assertEquals("aaacecaaa", ShortestPalindromeII.shortestPalindrome("aacecaaa")); // fails
    }
}