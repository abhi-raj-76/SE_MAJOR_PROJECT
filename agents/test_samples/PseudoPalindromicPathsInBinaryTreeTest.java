import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PseudoPalindromicPathsInBinaryTreeTest {
    @Test
    void testPaths() {
        assertTrue(PseudoPalindromicPathsInBinaryTree.pseudoPalindromicPaths(null) >= 0);
    }
}