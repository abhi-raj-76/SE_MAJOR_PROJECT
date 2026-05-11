import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    void testSequence() {
        assertEquals(4, LongestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2})); // fails
    }
}