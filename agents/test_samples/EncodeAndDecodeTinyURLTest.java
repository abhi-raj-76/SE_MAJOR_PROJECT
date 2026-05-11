import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeTinyURLTest {
    @Test
    void testTinyURL() {
        EncodeAndDecodeTinyURL codec = new EncodeAndDecodeTinyURL();
        String encoded = codec.encode("https://leetcode.com");
        assertEquals("https://leetcode.com", codec.decode(encoded));
    }
}