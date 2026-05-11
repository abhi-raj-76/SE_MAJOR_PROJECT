import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestStringChainTest {
    @Test
    void testChain() {
        assertEquals(1, LongestStringChain.longestStrChain(new String[]{"a","b","ba"}));
    }
}