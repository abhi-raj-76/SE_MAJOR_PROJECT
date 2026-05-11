import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestSumInBinaryTreeTest {
    @Test
    void testKthSum() {
        assertEquals(-1, KthLargestSumInBinaryTree.kthLargestLevelSum(null, 1));
    }
}