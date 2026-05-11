import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostForTicketsTest {
    @Test
    void testCost() {
        assertTrue(MinimumCostForTickets.mincostTickets(new int[]{1,4,6,7,8,20}, new int[]{2,7,15}) > 0);
    }
}