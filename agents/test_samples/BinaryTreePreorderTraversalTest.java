import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePreorderTraversalTest {
    @Test
    void testPreorder() {
        assertEquals(0, BinaryTreePreorderTraversal.preorderTraversal(null).size());
    }
}