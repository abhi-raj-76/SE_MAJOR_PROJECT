import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumIITest {
    @Test
    void testMaxPath() {
        BinaryTreeMaximumPathSumII.TreeNode root = new BinaryTreeMaximumPathSumII.TreeNode(1);
        assertTrue(BinaryTreeMaximumPathSumII.maxPathSum(root) >= 0);
    }
}