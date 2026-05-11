import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalAdderTest {
    @Test
    void testDiagonal() {
        MatrixDiagonalAdder m = new MatrixDiagonalAdder();
        assertEquals(15, m.sum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}