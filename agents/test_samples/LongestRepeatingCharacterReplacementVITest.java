import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementVITest {
    @Test
    void testReplacement() {
        LongestRepeatingCharacterReplacementVI solver = new LongestRepeatingCharacterReplacementVI();
        assertEquals(4, solver.characterReplacement("AABABBA", 1));
    }
}