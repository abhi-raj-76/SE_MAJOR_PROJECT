import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePruningTest {
    @Test
    void testPrune() {
        assertNull(BinaryTreePruning.pruneTree(null));
    }
}