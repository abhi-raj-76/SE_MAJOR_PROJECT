import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthPairChainTest {
    @Test
    void testChain() {
        assertEquals(0, MaximumLengthPairChain.findLongestChain(new int[][]{}));
    }
}