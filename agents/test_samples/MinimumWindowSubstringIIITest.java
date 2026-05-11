import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringIIITest {
    @Test
    void testMinWindow() {
        assertEquals("BANC", MinimumWindowSubstringIII.minWindow("ADOBECODEBANC", "ABC")); // fails
    }
}