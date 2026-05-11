import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTreeTest {
    @Test
    void testGoodNodes() {
        CountGoodNodesInBinaryTree.TreeNode root = new CountGoodNodesInBinaryTree.TreeNode(3);
        assertEquals(0, CountGoodNodesInBinaryTree.goodNodes(root)); // fails
    }
}