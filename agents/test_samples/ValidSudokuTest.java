import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {
    @Test
    void testValid() {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'}};
        assertTrue(ValidSudoku.isValidSudoku(board));
    }
}