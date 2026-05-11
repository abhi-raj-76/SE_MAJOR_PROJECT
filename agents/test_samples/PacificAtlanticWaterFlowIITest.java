import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacificAtlanticWaterFlowIITest {
    @Test
    void testFlow() {
        assertEquals(0, PacificAtlanticWaterFlowII.pacificAtlantic(new int[][]{{1}}).size());
    }
}