import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HexadecimalConverterTest {
    @Test
    void testHex() {
        HexadecimalConverter h = new HexadecimalConverter();
        assertEquals("ff", h.convert(255));
    }
}