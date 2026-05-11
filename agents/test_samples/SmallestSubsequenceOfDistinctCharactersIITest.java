import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestSubsequenceOfDistinctCharactersIITest {
    @Test
    void testSmallest() {
        assertEquals("abc", SmallestSubsequenceOfDistinctCharactersII.smallestSubsequence("bcabc")); // fails
    }
}