import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NaryTreeLevelOrderTraversalTest {
    @Test
    void testLevelOrder() {
        assertEquals(0, NaryTreeLevelOrderTraversal.levelOrder(null).size());
    }
}