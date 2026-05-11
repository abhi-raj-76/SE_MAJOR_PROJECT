import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthSmallestBSTTest {
    @Test
    void testKth() {
        KthSmallestBST.TreeNode root = new KthSmallestBST.TreeNode(3);
        assertEquals(3, KthSmallestBST.kthSmallest(root, 1));
    }
}