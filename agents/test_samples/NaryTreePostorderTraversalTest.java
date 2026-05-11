import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NaryTreePostorderTraversalTest {
    @Test
    void testPostorder() {
        assertEquals(0, NaryTreePostorderTraversal.postorder(null).size());
    }
}