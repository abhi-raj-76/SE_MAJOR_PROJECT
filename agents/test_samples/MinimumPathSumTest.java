import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {
    @Test
    void testMinPath() {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        assertTrue(MinimumPathSum.minPathSum(grid) > 0);
    }
}