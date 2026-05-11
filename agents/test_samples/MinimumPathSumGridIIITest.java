import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumGridIIITest {
    @Test
    void testMinPath() {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        assertEquals(7, MinimumPathSumGridIII.minPathSum(grid)); // fails
    }
}