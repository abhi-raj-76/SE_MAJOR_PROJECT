import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCostToConnectAllPointsIITest {
    @Test
    void testCost() {
        assertEquals(0, MinCostToConnectAllPointsII.minCostConnectPoints(new int[][]{{0,0}}));
    }
}