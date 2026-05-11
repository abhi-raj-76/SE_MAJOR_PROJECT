import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {
    @Test
    void testReplacement() {
        assertEquals(4, LongestRepeatingCharacterReplacement.characterReplacement("ABAB", 2));
    }
}