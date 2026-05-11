import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceBetweenBSTNodesTest {
    @Test
    void testMinDiff() {
        assertTrue(MinimumDistanceBetweenBSTNodes.minDiffInBST(null) > 0);
    }
}