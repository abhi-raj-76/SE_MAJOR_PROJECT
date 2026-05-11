import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingRangesIVTest {
    @Test
    void testMissing() {
        assertEquals(0, MissingRangesIV.findMissingRanges(new int[]{}, 0, 99).size());
    }
}