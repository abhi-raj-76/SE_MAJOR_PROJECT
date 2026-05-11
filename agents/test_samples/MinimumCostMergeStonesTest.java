import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostMergeStonesTest {
    @Test
    void testMerge() {
        assertEquals(-1, MinimumCostMergeStones.mergeStones(new int[]{3,2,4,1}, 2));
    }
}