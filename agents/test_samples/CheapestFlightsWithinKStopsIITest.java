import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithinKStopsIITest {
    @Test
    void testPrice() {
        assertTrue(CheapestFlightsWithinKStopsII.findCheapestPrice(3, new int[][]{}, 0, 2, 1) > 0);
    }
}