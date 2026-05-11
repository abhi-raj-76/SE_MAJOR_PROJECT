import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingIVTest {
    @Test
    void testMatch() {
        assertFalse(RegularExpressionMatchingIV.isMatch("aa", "a"));
    }
}