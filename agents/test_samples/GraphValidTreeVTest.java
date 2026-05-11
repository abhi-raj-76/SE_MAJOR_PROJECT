import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphValidTreeVTest {
    @Test
    void testValid() {
        GraphValidTreeV solver = new GraphValidTreeV();
        assertTrue(solver.validTree(5, new int[][]{{0,1},{0,2},{2,3},{2,4}}));
        assertFalse(solver.validTree(4, new int[][]{{0,1},{1,2},{2,3},{1,3}}));
    }

    @Test
    void testEdgeCases() {
        GraphValidTreeV solver = new GraphValidTreeV();
        assertTrue(solver.validTree(1, new int[][]{}));
        assertFalse(solver.validTree(3, new int[][]{{0,1}}));
    }
}