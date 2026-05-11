import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrimBinarySearchTreeTest {
    @Test
    void testTrim() {
        assertNull(TrimBinarySearchTree.trimBST(null, 1, 2));
    }
}