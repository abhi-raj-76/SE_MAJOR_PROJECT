import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeCheckerTest {
    @Test
    void testSymmetric() {
        SymmetricTreeChecker.TreeNode root = new SymmetricTreeChecker.TreeNode(1);
        root.left = new SymmetricTreeChecker.TreeNode(2);
        root.right = new SymmetricTreeChecker.TreeNode(2);
        assertTrue(SymmetricTreeChecker.isSymmetric(root));
    }
}