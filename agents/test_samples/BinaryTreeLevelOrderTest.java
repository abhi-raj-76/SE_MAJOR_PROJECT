import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTest {
    @Test
    void testLevelOrder() {
        assertEquals(0, BinaryTreeLevelOrder.levelOrder(null).size());
    }
}