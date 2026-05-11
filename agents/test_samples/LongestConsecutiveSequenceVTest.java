import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceVTest {
    @Test
    void testSequence() {
        assertEquals(0, LongestConsecutiveSequenceV.longestConsecutive(new int[]{}));
    }
}