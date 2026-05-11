import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RussianDollEnvelopesTest {
    @Test
    void testEnvelopes() {
        assertEquals(1, RussianDollEnvelopes.maxEnvelopes(new int[][]{{5,4},{6,4},{6,7},{2,3}}));
    }
}