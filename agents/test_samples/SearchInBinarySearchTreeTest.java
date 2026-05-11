import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchInBinarySearchTreeTest {
    @Test
    void testSearch() {
        SearchInBinarySearchTree.TreeNode root = new SearchInBinarySearchTree.TreeNode(4);
        assertNotNull(SearchInBinarySearchTree.searchBST(root, 4));
    }
}