import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumFuelCostToReportToCapitalTest {
    @Test
    void testFuel() {
        assertEquals(0, MinimumFuelCostToReportToCapital.minimumFuelCost(new int[][]{}, 1));
    }
}