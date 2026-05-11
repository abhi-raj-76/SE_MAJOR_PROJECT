import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingPathInMatrixTest {
    @Test
    void testPath() {
        assertEquals(0, LongestIncreasingPathInMatrix.longestIncreasingPath(new int[][]{}));
    }
}