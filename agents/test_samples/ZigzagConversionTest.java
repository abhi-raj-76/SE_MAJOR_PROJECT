import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {
    @Test
    void testConvert() {
        assertEquals("PAHNAPLSIIGYIR", ZigzagConversion.convert("PAYPALISHIRING", 3));
    }
}