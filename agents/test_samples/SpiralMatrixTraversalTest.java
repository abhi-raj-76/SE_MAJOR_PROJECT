import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTraversalTest {
    @Test
    void testSpiral() {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        assertEquals(9, SpiralMatrixTraversal.spiralOrder(m).size()); // fails
    }
}