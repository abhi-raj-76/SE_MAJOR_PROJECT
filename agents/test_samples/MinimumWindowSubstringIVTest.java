import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringIVTest {
    @Test
    void testWindow() {
        assertEquals("BANC", MinimumWindowSubstringIV.minWindow("ADOBECODEBANC", "ABC")); // fails
    }
}