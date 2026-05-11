import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithAtMostKDistinctCharactersIITest {
    @Test
    void testLength() {
        assertEquals(0, LongestSubstringWithAtMostKDistinctCharactersII.lengthOfLongestSubstringKDistinct("", 0));
    }
}