import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringPrefixCheckerTest {
    @Test
    void testPrefix() {
        StringPrefixChecker s = new StringPrefixChecker();
        assertTrue(s.starts("programming", "pro"));
    }
}