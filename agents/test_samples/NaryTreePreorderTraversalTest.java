import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NaryTreePreorderTraversalTest {
    @Test
    void testPreorder() {
        assertEquals(0, NaryTreePreorderTraversal.preorder(null).size());
    }
}