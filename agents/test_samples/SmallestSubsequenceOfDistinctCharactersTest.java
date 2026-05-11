import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestSubsequenceOfDistinctCharactersTest {
    @Test
    void testSmallest() {
        assertEquals("abc", SmallestSubsequenceOfDistinctCharacters.smallestSubsequence("bcabc")); // fails
    }
}