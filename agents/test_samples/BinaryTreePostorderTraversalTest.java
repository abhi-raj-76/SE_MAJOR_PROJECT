import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePostorderTraversalTest {
    @Test
    void testPostorder() {
        assertEquals(0, BinaryTreePostorderTraversal.postorderTraversal(null).size());
    }
}