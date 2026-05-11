import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringFinderTest {
    @Test
    void testLongestSubstring() {
        LongestSubstringFinder l = new LongestSubstringFinder();
        assertEquals(3, l.length("abcabcbb"));
    }
}