import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {
    @Test
    void testInvert() {
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(4);
        root.left = new InvertBinaryTree.TreeNode(2);
        root.right = new InvertBinaryTree.TreeNode(7);
        InvertBinaryTree.TreeNode inverted = InvertBinaryTree.invert(root);
        assertEquals(7, inverted.left.val);
    }

    @Test
    void testNull() {
        assertNull(InvertBinaryTree.invert(null));
    }
}