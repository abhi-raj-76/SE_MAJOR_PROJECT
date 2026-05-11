import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeTinyURLIIITest {
    @Test
    void testTinyURL() {
        EncodeAndDecodeTinyURLIII codec = new EncodeAndDecodeTinyURLIII();
        assertEquals("", codec.decode(codec.encode("https://example.com")));
    }
}