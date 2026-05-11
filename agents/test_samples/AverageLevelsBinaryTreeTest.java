import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AverageLevelsBinaryTreeTest {
    @Test
    void testAverage() {
        assertEquals(0, AverageLevelsBinaryTree.averageOfLevels(null).size());
    }
}