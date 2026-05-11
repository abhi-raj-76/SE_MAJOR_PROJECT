import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCostToConnectAllPointsTest {
    @Test
    void testCost() {
        assertEquals(0, MinCostToConnectAllPoints.minCostConnectPoints(new int[][]{{0,0}}));
    }
}