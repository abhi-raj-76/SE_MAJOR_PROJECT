import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeHeightTest {
    @Test
    void testSingleNode() {
        BinaryTreeHeight.Node root = new BinaryTreeHeight.Node(1);
        assertEquals(1, BinaryTreeHeight.height(root));
    }

    @Test
    void testBalanced() {
        BinaryTreeHeight.Node root = new BinaryTreeHeight.Node(1);
        root.left = new BinaryTreeHeight.Node(2);
        root.right = new BinaryTreeHeight.Node(3);
        assertEquals(2, BinaryTreeHeight.height(root));
    }

    @Test
    void testSkewed() {
        BinaryTreeHeight.Node root = new BinaryTreeHeight.Node(1);
        root.left = new BinaryTreeHeight.Node(2);
        root.left.left = new BinaryTreeHeight.Node(3);
        assertEquals(3, BinaryTreeHeight.height(root));
    }

    @Test
    void testNull() {
        assertEquals(0, BinaryTreeHeight.height(null));
    }
}