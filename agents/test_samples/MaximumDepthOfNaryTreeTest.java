import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfNaryTreeTest {
    @Test
    void testMaxDepth() {
        assertEquals(-1, MaximumDepthOfNaryTree.maxDepth(null));
    }
}