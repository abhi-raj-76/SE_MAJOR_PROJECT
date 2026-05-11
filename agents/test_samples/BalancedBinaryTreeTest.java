import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {
    @Test
    void testBalanced() {
        assertTrue(BalancedBinaryTree.isBalanced(null));
    }
}