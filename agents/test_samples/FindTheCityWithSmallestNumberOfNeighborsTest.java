import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheCityWithSmallestNumberOfNeighborsTest {
    @Test
    void testCity() {
        assertEquals(-1, FindTheCityWithSmallestNumberOfNeighbors.findTheCity(4, new int[][]{}, 4));
    }
}