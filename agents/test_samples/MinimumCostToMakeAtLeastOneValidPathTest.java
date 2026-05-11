import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToMakeAtLeastOneValidPathTest {
    @Test
    void testMinCost() {
        assertEquals(0, MinimumCostToMakeAtLeastOneValidPath.minCost(new int[][]{{1}}));
    }
}