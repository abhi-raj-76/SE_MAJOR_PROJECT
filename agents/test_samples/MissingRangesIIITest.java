import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingRangesIIITest {
    @Test
    void testMissing() {
        assertEquals(0, MissingRangesIII.findMissingRanges(new int[]{}, 0, 99).size());
    }
}