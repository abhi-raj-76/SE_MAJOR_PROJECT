import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModeInBinarySearchTreeTest {
    @Test
    void testMode() {
        assertEquals(0, ModeInBinarySearchTree.findMode(null).length);
    }
}