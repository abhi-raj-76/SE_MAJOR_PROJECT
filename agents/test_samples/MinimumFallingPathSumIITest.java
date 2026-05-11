import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSumIITest {
    @Test
    void testFalling() {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        assertTrue(MinimumFallingPathSumII.minFallingPathSum(matrix) > 0);
    }
}