import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxDepthBinaryTreeTest {
    @Test
    void testDepth() {
        MaxDepthBinaryTree.TreeNode root = new MaxDepthBinaryTree.TreeNode(1);
        assertEquals(1, MaxDepthBinaryTree.maxDepth(root));
    }
}