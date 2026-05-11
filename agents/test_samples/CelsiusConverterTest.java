import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CelsiusConverterTest {
    @Test
    void testConvert() {
        CelsiusConverter c = new CelsiusConverter();
        assertEquals(0.0, c.convert(32), 0.1);
    }
}