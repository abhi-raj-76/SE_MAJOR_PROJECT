import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCostToConnectAllPointsIIITest {
    @Test
    void testCost() {
        assertEquals(0, MinCostToConnectAllPointsIII.minCostConnectPoints(new int[][]{{0,0}}));
    }
}