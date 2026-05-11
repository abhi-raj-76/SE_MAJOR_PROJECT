import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringVITest {
    @Test
    void testWindow() {
        assertEquals("BANC", MinimumWindowSubstringVI.minWindow("ADOBECODEBANC", "ABC")); // fails
    }
}