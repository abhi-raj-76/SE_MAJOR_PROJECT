import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithAtMostTwoDistinctCharactersIITest {
    @Test
    void testLength() {
        assertEquals(3, LongestSubstringWithAtMostTwoDistinctCharactersII.lengthOfLongestSubstringTwoDistinct("eceba")); // fails
    }
}