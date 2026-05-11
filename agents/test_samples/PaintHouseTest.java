import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaintHouseTest {
    @Test
    void testMinCost() {
        assertTrue(PaintHouse.minCost(new int[][]{{17,2,17},{16,16,5},{14,3,19}}) > 0);
    }
}