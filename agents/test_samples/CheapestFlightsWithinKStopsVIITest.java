import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithinKStopsVIITest {
    @Test
    void testPrice() {
        assertEquals(-1, CheapestFlightsWithinKStopsVII.findCheapestPrice(3, new int[][]{}, 0, 2, 1));
    }
}