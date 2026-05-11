import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithinKStopsIIITest {
    @Test
    void testPrice() {
        assertEquals(-1, CheapestFlightsWithinKStopsIII.findCheapestPrice(3, new int[][]{}, 0, 2, 1));
    }
}