import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeStringsTest {
    @Test
    void testCodec() {
        java.util.List<String> input = java.util.List.of("hello", "world");
        String encoded = EncodeAndDecodeStrings.encode(input);
        assertEquals(input, EncodeAndDecodeStrings.decode(encoded));
    }
}