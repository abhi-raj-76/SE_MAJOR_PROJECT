import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceCapitalizerTest {
    @Test
    void testCapitalize() {
        SentenceCapitalizer s = new SentenceCapitalizer();
        assertEquals("Hello", s.capitalize("hello"));
    }
}