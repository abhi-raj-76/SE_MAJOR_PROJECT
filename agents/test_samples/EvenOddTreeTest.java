import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTreeTest {
    @Test
    void testEvenOdd() {
        EvenOddTree.TreeNode root = new EvenOddTree.TreeNode(1);
        assertTrue(EvenOddTree.isEvenOddTree(root));
    }
}