import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPathInBinaryMatrixTest {
    @Test
    void testPath() {
        assertEquals(0, ShortestPathInBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0}}));
    }
}