import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryConverterTest {
    @Test
    void testBinary() {
        DecimalToBinaryConverter d = new DecimalToBinaryConverter();
        assertEquals("1010", d.convert(10));
    }
}