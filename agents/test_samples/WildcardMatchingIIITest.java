import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingIIITest {
    @Test
    void testMatch() {
        assertTrue(WildcardMatchingIII.isMatch("aa", "*")); // fails
    }
}