import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceBSTTest {
    @Test
    void testMinDiff() {
        assertTrue(MinimumDistanceBST.minDiffInBST(null) > 0);
    }
}