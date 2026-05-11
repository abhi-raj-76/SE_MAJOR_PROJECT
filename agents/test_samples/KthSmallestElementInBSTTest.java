import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInBSTTest {
    @Test
    void testKth() {
        KthSmallestElementInBST.TreeNode root = new KthSmallestElementInBST.TreeNode(3);
        assertEquals(3, KthSmallestElementInBST.kthSmallest(root, 1));
    }
}