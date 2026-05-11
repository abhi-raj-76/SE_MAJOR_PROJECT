import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NaryTreePostorderTraversalIITest {
    @Test
    void testPostorder() {
        assertEquals(0, NaryTreePostorderTraversalII.postorder(null).size());
    }
}