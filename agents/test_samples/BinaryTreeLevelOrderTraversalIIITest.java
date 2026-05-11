import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalIIITest {
    @Test
    void testLevelOrder() {
        assertEquals(0, BinaryTreeLevelOrderTraversalIII.levelOrder(null).size());
    }
}