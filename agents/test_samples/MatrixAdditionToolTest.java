import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixAdditionToolTest {
    @Test
    void testAdd() {
        MatrixAdditionTool m = new MatrixAdditionTool();
        int[][] result = m.add(
            new int[][]{{1,2},{3,4}},
            new int[][]{{5,6},{7,8}}
        );
        assertEquals(6, result[0][0]);
        assertEquals(12, result[1][1]);
    }
}