import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixColumnSummerTest {
    @Test
    void testColumns() {
        MatrixColumnSummer m = new MatrixColumnSummer();
        assertArrayEquals(new int[]{5,7,9}, m.sums(new int[][]{{1,2,3},{4,5,6}}));
    }
}