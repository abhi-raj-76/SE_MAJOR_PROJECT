import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithAtMostKDistinctCharactersTest {
    @Test
    void testLength() {
        assertEquals(3, LongestSubstringWithAtMostKDistinctCharacters.lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}