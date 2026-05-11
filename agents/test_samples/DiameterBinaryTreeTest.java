import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiameterBinaryTreeTest {
    @Test
    void testDiameter() {
        DiameterBinaryTree.TreeNode root = new DiameterBinaryTree.TreeNode(1);
        assertTrue(DiameterBinaryTree.diameter(root) > 0);
    }
}