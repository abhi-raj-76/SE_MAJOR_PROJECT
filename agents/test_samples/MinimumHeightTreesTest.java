import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumHeightTreesTest {
    @Test
    void testMinHeight() {
        assertEquals(1, MinimumHeightTrees.findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}}).size()); // fails
    }
}