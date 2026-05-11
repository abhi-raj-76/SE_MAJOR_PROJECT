import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsWithCostVTest {
    @Test
    void testMinCost() {
        ClimbingStairsWithCostV solver = new ClimbingStairsWithCostV();
        assertEquals(15, solver.minCostClimbingStairs(new int[]{10,15,20}));
        assertEquals(6, solver.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}