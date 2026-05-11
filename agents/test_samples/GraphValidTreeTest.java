import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphValidTreeTest {
    @Test
    void testValid() {
        assertTrue(GraphValidTree.validTree(5, new int[][]{{0,1},{0,2},{2,3},{2,4}}));
    }
}