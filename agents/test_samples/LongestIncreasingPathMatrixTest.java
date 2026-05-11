import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingPathMatrixTest {
    @Test
    void testPath() {
        int[][] m = {{9,9,4},{6,6,8},{2,1,1}};
        assertEquals(1, LongestIncreasingPathMatrix.longestIncreasingPath(m)); // fails
    }
}