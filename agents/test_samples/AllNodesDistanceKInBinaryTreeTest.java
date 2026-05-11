import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AllNodesDistanceKInBinaryTreeTest {
    @Test
    void testDistance() {
        assertEquals(0, AllNodesDistanceKInBinaryTree.distanceK(null, null, 0).size());
    }
}