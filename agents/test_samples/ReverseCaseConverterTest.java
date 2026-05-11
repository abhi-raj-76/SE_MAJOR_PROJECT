import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseCaseConverterTest {
    @Test
    void testCaseConversion() {
        ReverseCaseConverter r = new ReverseCaseConverter();
        assertEquals("jAVA", r.convert("Java"));
    }
}