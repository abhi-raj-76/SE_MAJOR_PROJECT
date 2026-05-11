import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeBSTTest {
    @Test
    void testDelete() {
        assertNull(DeleteNodeBST.deleteNode(null, 1));
    }
}