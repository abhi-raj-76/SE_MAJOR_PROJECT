import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeTinyURLIITest {
    @Test
    void testTinyURL() {
        EncodeAndDecodeTinyURLII codec = new EncodeAndDecodeTinyURLII();
        assertEquals("", codec.decode(codec.encode("https://example.com")));
    }
}