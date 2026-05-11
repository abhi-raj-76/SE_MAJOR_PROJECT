import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveCharacterCompressorTest {
    @Test
    void testCompress() {
        assertEquals(
                "a3b2",
                ConsecutiveCharacterCompressor
                        .compress("aaabb")
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                "a1",
                ConsecutiveCharacterCompressor
                        .compress("a")
        );
    }

    @Test
    void testEmpty() {
        assertEquals(
                "",
                ConsecutiveCharacterCompressor
                        .compress("")
        );
    }
}