import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostClimbingStairsTest {
    @Test
    void testMinCost() {
        assertTrue(MinimumCostClimbingStairs.minCostClimbingStairs(new int[]{10,15,20}) > 0);
    }
}