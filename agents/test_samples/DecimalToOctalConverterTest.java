import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalToOctalConverterTest {
    @Test
    void testConvert() {
        DecimalToOctalConverter c = new DecimalToOctalConverter();
        assertEquals("12", c.convert(10));
    }
}