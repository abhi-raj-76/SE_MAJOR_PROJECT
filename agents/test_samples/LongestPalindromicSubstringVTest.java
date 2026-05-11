import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringVTest {
    @Test
    void testLongest() {
        assertEquals("bab", LongestPalindromicSubstringV.longestPalindrome("babad")); // fails
    }
}