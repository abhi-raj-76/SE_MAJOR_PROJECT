import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {
    @Test
    void testCount() {
        assertEquals(3, PalindromicSubstrings.countSubstrings("abc"));
    }
}