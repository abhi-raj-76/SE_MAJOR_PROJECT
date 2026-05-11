import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringIITest {
    @Test
    void testMinWindow() {
        assertEquals("BANC", MinimumWindowSubstringII.minWindow("ADOBECODEBANC", "ABC")); // fails
    }
}