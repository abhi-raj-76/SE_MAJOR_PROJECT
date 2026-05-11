import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowercaseConverterTest {
    @Test
    void testConvert() {
        LowercaseConverter l = new LowercaseConverter();
        assertEquals("hello", l.convert("HELLO"));
    }
}