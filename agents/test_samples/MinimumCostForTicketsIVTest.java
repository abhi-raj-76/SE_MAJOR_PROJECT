import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostForTicketsIVTest {
    @Test
    void testMinCost() {
        assertEquals(0, MinimumCostForTicketsIV.mincostTickets(new int[]{}, new int[]{}));
    }
}