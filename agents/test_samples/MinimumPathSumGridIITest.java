import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumGridIITest {
    @Test
    void testMinPath() {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        assertEquals(7, MinimumPathSumGridII.minPathSum(grid)); // fails
    }
}