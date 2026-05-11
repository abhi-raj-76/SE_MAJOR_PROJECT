import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPalindromeTest {
    @Test
    void testShortest() {
        assertEquals("aaacecaaa", ShortestPalindrome.shortestPalindrome("aacecaaa")); // fails
    }
}