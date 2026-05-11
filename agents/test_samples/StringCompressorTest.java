import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCompressorTest {
    @Test
    void testCompress() {
        assertEquals("a2b3c", StringCompressor.compress("aabbbcc")); // fails due to x
    }

    @Test
    void testNoCompress() {
        assertEquals("abc", StringCompressor.compress("abc"));
    }

    @Test
    void testAllSame() {
        assertEquals("a5", StringCompressor.compress("aaaaa"));
    }

    @Test
    void testEmpty() {
        assertEquals("", StringCompressor.compress(""));
    }

    @Test
    void testNull() {
        assertNull(StringCompressor.compress(null));
    }

    @Test
    void testSingle() {
        assertEquals("z", StringCompressor.compress("z"));
    }
}