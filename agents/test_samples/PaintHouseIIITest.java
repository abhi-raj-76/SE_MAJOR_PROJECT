import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaintHouseIIITest {
    @Test
    void testMinCost() {
        assertTrue(PaintHouseIII.minCost(new int[]{}, new int[][]{}, 0, 0, 0) < 0);
    }
}