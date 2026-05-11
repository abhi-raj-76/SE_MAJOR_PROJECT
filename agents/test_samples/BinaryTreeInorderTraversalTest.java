import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {
    @Test
    void testInorder() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        assertEquals(1, BinaryTreeInorderTraversal.inorderTraversal(root).size());
    }
}