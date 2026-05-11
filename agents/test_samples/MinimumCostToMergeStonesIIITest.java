import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToMergeStonesIIITest {
    @Test
    void testMerge() {
        assertEquals(0, MinimumCostToMergeStonesIII.mergeStones(new int[]{}, 2));
    }
}