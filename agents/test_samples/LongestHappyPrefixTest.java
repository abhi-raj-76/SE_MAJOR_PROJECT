import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestHappyPrefixTest {
    @Test
    void testPrefix() {
        assertEquals("a", LongestHappyPrefix.longestPrefix("aaaa"));
    }
}