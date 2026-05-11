import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSumIIITest {
    @Test
    void testFalling() {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        assertTrue(MinimumFallingPathSumIII.minFallingPathSum(matrix) > 0);
    }
}