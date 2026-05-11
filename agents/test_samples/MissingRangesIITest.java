import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingRangesIITest {
    @Test
    void testMissing() {
        assertEquals(0, MissingRangesII.findMissingRanges(new int[]{}, 0, 99).size());
    }
}