import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringAppenderTest {
    @Test
    void testAppend() {
        StringAppender s = new StringAppender();
        assertEquals("hellojava", s.append("hello","java"));
    }
}