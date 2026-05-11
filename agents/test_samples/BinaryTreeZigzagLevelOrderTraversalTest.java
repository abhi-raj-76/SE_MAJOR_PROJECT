import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeZigzagLevelOrderTraversalTest {
    @Test
    void testZigzag() {
        assertEquals(0, BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(null).size());
    }
}