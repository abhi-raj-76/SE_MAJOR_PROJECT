import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeStringsIITest {
    @Test
    void testCodec() {
        java.util.List<String> input = java.util.List.of("hello");
        assertEquals("", EncodeAndDecodeStringsII.encode(input)); // fails
    }
}