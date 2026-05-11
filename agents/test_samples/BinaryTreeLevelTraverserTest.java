import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelTraverserTest {
    @Test
    void testLevelTraversal() {
        BinaryTreeLevelTraverser.Node root =
                new BinaryTreeLevelTraverser.Node(1);

        root.left = new BinaryTreeLevelTraverser.Node(2);
        root.right = new BinaryTreeLevelTraverser.Node(3);

        BinaryTreeLevelTraverser b =
                new BinaryTreeLevelTraverser();

        assertEquals(2, b.traverse(root).size());
    }
}