import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeTinyURLIVTest {
    @Test
    void testTinyURL() {
        EncodeAndDecodeTinyURLIV codec = new EncodeAndDecodeTinyURLIV();
        assertEquals("", codec.decode(codec.encode("https://example.com")));
    }
}