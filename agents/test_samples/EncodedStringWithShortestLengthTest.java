import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncodedStringWithShortestLengthTest {
    @Test
    void testEncode() {
        assertEquals("aaa", new EncodedStringWithShortestLength().encode("aaa"));
    }
}