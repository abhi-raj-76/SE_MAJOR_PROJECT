import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToConnectAllCitiesTest {
    @Test
    void testMinimumCost() {
        assertEquals(0, MinimumCostToConnectAllCities.minimumCost(1, new int[][]{}));
    }
}