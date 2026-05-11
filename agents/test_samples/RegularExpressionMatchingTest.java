import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {
    @Test
    void testMatch() {
        assertTrue(RegularExpressionMatching.isMatch("aab", "c*a*b"));
    }
}