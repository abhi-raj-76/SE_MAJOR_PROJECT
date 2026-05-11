import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NQueensSolverVTest {
    @Test
    void testNQueens() {
        NQueensSolverV solver = new NQueensSolverV();
        assertEquals(2, solver.totalNQueens(4));
    }
}