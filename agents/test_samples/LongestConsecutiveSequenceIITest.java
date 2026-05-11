import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceIITest {
    @Test
    void testSequence() {
        assertEquals(4, LongestConsecutiveSequenceII.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}