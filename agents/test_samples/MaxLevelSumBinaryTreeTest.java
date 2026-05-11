import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxLevelSumBinaryTreeTest {
    @Test
    void testMaxLevel() {
        assertTrue(MaxLevelSumBinaryTree.maxLevelSum(null) < 0);
    }
}