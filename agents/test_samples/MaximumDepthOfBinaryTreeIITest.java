import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeIITest {
    @Test
    void testMaxDepth() {
        MaximumDepthOfBinaryTreeII.TreeNode root = new MaximumDepthOfBinaryTreeII.TreeNode(1);
        assertEquals(1, MaximumDepthOfBinaryTreeII.maxDepth(root));
    }
}