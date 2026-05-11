import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingRangesTest {
    @Test
    void testMissing() {
        assertTrue(MissingRanges.findMissingRanges(new int[]{0,1,3,50,75}, 0, 99).size() > 0); // fails
    }
}