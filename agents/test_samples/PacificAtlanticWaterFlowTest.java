import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacificAtlanticWaterFlowTest {
    @Test
    void testFlow() {
        int[][] h = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        assertTrue(PacificAtlanticWaterFlow.pacificAtlantic(h).size() > 0);
    }
}