import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingIITest {
    @Test
    void testMatch() {
        assertTrue(WildcardMatchingII.isMatch("aa", "*")); // fails
    }
}