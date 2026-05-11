import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCostToConnectAllPointsVTest {
    @Test
    void testCost() {
        assertEquals(0, MinCostToConnectAllPointsV.minCostConnectPoints(new int[][]{{0,0}}));
    }
}