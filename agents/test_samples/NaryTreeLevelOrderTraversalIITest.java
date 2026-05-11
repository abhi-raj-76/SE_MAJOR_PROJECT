import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NaryTreeLevelOrderTraversalIITest {
    @Test
    void testLevelOrder() {
        assertEquals(0, NaryTreeLevelOrderTraversalII.levelOrder(null).size());
    }
}