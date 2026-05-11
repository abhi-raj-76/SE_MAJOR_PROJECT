import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingPathInMatrixIVTest {
    @Test
    void testPath() {
        assertEquals(0, LongestIncreasingPathInMatrixIV.longestIncreasingPath(new int[][]{}));
    }
}