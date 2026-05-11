import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalIITest {
    @Test
    void testLevelOrderBottom() {
        assertEquals(0, BinaryTreeLevelOrderTraversalII.levelOrderBottom(null).size());
    }
}