import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VerticalOrderTraversalOfBinaryTreeTest {
    @Test
    void testVertical() {
        assertEquals(0, VerticalOrderTraversalOfBinaryTree.verticalTraversal(null).size());
    }
}