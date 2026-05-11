import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToMergeStonesIITest {
    @Test
    void testMerge() {
        assertEquals(0, MinimumCostToMergeStonesII.mergeStones(new int[]{}, 2));
    }
}