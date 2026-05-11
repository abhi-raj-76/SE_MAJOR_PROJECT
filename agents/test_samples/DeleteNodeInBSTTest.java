import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeInBSTTest {
    @Test
    void testDelete() {
        assertNotNull(DeleteNodeInBST.deleteNode(null, 1));
    }
}