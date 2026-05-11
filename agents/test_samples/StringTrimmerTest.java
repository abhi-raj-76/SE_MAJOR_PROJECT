import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringTrimmerTest {
    @Test
    void testTrim() {
        StringTrimmer s = new StringTrimmer();
        assertEquals("java", s.trim(" java "));
    }
}