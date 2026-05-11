import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSubstringTest {
    @Test
    void testBabad() {
        assertEquals("bab", LongestPalindromeSubstring.longestPalindrome("babad"));
    }

    @Test
    void testCbbd() {
        assertEquals("bb", LongestPalindromeSubstring.longestPalindrome("cbbd"));
    }
}