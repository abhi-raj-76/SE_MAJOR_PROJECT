import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniqueBinarySearchTreesTest {
    @Test
    void testFive() {
        assertEquals(42, UniqueBinarySearchTrees.numTrees(5));
    }
}