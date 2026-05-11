import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithinKStopsVITest {
    @Test
    void testPrice() {
        assertEquals(-1, CheapestFlightsWithinKStopsVI.findCheapestPrice(3, new int[][]{}, 0, 2, 1));
    }
}