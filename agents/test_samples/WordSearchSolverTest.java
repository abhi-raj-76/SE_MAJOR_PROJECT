import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchSolverTest {
    @Test
    void testExist() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        assertTrue(WordSearchSolver.exist(board, "ABCCED")); // will fail
    }
}