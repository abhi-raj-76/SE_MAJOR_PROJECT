import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingIITest {
    @Test
    void testMatch() {
        assertTrue(RegularExpressionMatchingII.isMatch("aa", "a*"));
    }
}