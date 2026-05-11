import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringRepeaterTest {
    @Test
    void testRepeat() {
        StringRepeater s = new StringRepeater();
        assertEquals("aaa", s.repeat("a", 3));
    }
}