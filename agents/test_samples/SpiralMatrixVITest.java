import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SpiralMatrixVITest {
    @Test
    void testSpiral() {
        SpiralMatrixVI solver = new SpiralMatrixVI();
        List<Integer> res = solver.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        assertEquals(1, res.get(0));
    }
}