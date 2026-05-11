import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithinKStopsTest {
    @Test
    void testPrice() {
        assertTrue(CheapestFlightsWithinKStops.findCheapestPrice(3, new int[][]{}, 0, 2, 1) > 0);
    }
}