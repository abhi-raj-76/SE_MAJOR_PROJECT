import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeIITest {
    @Test
    void testInvert() {
        InvertBinaryTreeII.TreeNode root = new InvertBinaryTreeII.TreeNode(1);
        assertNotNull(InvertBinaryTreeII.invertTree(root));
    }
}