import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringIITest {
    @Test
    void testLongest() {
        assertEquals("bab", LongestPalindromicSubstringII.longestPalindrome("babad")); // fails
    }
}