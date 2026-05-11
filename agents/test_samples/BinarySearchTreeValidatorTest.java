import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeValidatorTest {
    @Test
    void testBST() {
        BinarySearchTreeValidator.TreeNode root =
                new BinarySearchTreeValidator.TreeNode(2);

        root.left = new BinarySearchTreeValidator.TreeNode(1);
        root.right = new BinarySearchTreeValidator.TreeNode(3);

        BinarySearchTreeValidator b = new BinarySearchTreeValidator();
        assertTrue(b.isValid(root));
    }
}