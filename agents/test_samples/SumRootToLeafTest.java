import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafTest {
    @Test
    void testSum() {
        SumRootToLeaf.TreeNode root = new SumRootToLeaf.TreeNode(1);
        assertEquals(1, SumRootToLeaf.sumNumbers(root));
    }
}