import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WildcardMatchingTest {
    @Test
    void testMatch() {
        assertTrue(WildcardMatching.isMatch("aa", "a*"));
    }
}