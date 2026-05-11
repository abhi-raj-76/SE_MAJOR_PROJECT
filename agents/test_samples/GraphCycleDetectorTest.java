import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphCycleDetectorTest {
    @Test
    void testCycleGraph() {
        GraphCycleDetector g = new GraphCycleDetector();

        int[][] edges = {
                {0,1},
                {1,2},
                {2,0}
        };

        assertTrue(g.hasCycle(3, edges));
    }
}