import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeepestLeavesSumIITest {
    @Test
    void testDeepestSum() {
        DeepestLeavesSumII.TreeNode root = new DeepestLeavesSumII.TreeNode(1);
        assertEquals(1, DeepestLeavesSumII.deepestLeavesSum(root));
    }
}