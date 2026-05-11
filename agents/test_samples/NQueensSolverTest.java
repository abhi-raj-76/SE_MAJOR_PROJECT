import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NQueensSolverTest {
    @Test
    void testN4() {
        assertEquals(2, NQueensSolver.totalNQueens(4));
    }

    @Test
    void testN1() {
        assertEquals(1, NQueensSolver.totalNQueens(1));
    }

    @Test
    void testN2() {
        assertEquals(0, NQueensSolver.totalNQueens(2));
    }

    @Test
    void testN8() {
        assertEquals(92, NQueensSolver.totalNQueens(8));
    }

    @Test
    void testN0() {
        assertEquals(0, NQueensSolver.totalNQueens(0));
    }
}