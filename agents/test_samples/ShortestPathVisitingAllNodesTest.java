import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPathVisitingAllNodesTest {
    @Test
    void testPathLength() {
        assertEquals(0, ShortestPathVisitingAllNodes.shortestPathLength(new int[][]{}));
    }
}