import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CloneNaryTreeTest {
    @Test
    void testClone() {
        assertNull(CloneNaryTree.cloneTree(null));
    }
}