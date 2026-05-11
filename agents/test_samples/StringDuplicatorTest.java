import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringDuplicatorTest {
    @Test
    void testDuplicate() {
        StringDuplicator s = new StringDuplicator();
        assertEquals("abcabc", s.duplicate("abc"));
    }
}