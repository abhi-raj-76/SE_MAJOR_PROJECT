import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixRowSummerTest {
    @Test
    void testRows() {
        MatrixRowSummer m = new MatrixRowSummer();
        assertArrayEquals(new int[]{6,15}, m.rowSums(new int[][]{{1,2,3},{4,5,6}}));
    }
}