import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {
    @Test
    void testMaxPath() {
        BinaryTreeMaximumPathSum.TreeNode root = new BinaryTreeMaximumPathSum.TreeNode(1);
        assertTrue(BinaryTreeMaximumPathSum.maxPathSum(root) > 0);
    }
}