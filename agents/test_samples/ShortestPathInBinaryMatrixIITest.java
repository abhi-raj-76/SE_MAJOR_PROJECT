import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPathInBinaryMatrixIITest {
    @Test
    void testPath() {
        assertEquals(0, ShortestPathInBinaryMatrixII.shortestPathBinaryMatrix(new int[][]{{0}}));
    }
}