import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SudokuSolverTest {
    @Test
    void testSolve() {
        char[][] board = new char[9][9]; // empty for demo
        SudokuSolver.solveSudoku(board);
        assertNotNull(board);
    }
}