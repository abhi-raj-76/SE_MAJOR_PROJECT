import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniquePathsIITest {
    @Test
    void testUniquePaths() {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        assertEquals(2, UniquePathsII.uniquePathsWithObstacles(grid));
    }
}