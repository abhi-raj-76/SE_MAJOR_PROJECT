import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSumTest {
    @Test
    void testFalling() {
        assertTrue(MinimumFallingPathSum.minFallingPathSum(new int[][]{{2,1,3},{6,5,4},{7,8,9}}) > 0);
    }
}