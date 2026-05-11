import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringIIITest {
    @Test
    void testLongest() {
        assertEquals("bab", LongestPalindromicSubstringIII.longestPalindrome("babad")); // fails
    }
}