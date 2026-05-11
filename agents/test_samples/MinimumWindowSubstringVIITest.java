import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringVIITest {
    @Test
    void testWindow() {
        assertEquals("BANC", MinimumWindowSubstringVII.minWindow("ADOBECODEBANC", "ABC")); // fails
    }
}