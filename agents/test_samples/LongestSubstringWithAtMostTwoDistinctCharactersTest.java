import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithAtMostTwoDistinctCharactersTest {
    @Test
    void testLength() {
        assertEquals(3, LongestSubstringWithAtMostTwoDistinctCharacters.lengthOfLongestSubstringTwoDistinct("eceba")); // fails
    }
}