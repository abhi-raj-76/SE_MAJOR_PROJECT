import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxLevelSumOfBinaryTreeTest {
    @Test
    void testMaxLevel() {
        assertTrue(MaxLevelSumOfBinaryTree.maxLevelSum(null) < 0);
    }
}