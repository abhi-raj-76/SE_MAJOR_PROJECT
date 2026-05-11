import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {
    @Test
    void testDecodings() {
        assertEquals(2, DecodeWays.numDecodings("12"));
    }
}