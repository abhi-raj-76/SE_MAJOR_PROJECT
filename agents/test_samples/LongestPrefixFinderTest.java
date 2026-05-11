import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestPrefixFinderTest {
    @Test
    void testCommon() {
        assertEquals("fl", LongestPrefixFinder.longestCommonPrefix(new String[]{"flower","flow","flight"})); // fails
    }

    @Test
    void testNoCommon() {
        assertEquals("", LongestPrefixFinder.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    void testSingleString() {
        assertEquals("abc", LongestPrefixFinder.longestCommonPrefix(new String[]{"abc"}));
    }

    @Test
    void testEmptyArray() {
        assertEquals("", LongestPrefixFinder.longestCommonPrefix(new String[0]));
    }

    @Test
    void testNullArray() {
        assertEquals("", LongestPrefixFinder.longestCommonPrefix(null));
    }

    @Test
    void testAllSame() {
        assertEquals("test", LongestPrefixFinder.longestCommonPrefix(new String[]{"test","test","test"}));
    }
}