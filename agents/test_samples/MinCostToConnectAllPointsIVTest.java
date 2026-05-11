import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCostToConnectAllPointsIVTest {
    @Test
    void testCost() {
        assertEquals(0, MinCostToConnectAllPointsIV.minCostConnectPoints(new int[][]{{0,0}}));
    }
}