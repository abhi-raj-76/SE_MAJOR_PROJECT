import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingPathInMatrixIITest {
    @Test
    void testPath() {
        assertEquals(0, LongestIncreasingPathInMatrixII.longestIncreasingPath(new int[][]{}));
    }
}