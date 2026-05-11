import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeepestLeavesSumTest {
    @Test
    void testSum() {
        DeepestLeavesSum.TreeNode root = new DeepestLeavesSum.TreeNode(1);
        assertEquals(1, DeepestLeavesSum.deepestLeavesSum(root));
    }
}