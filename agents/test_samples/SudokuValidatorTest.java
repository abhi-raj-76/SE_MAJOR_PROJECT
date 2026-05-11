import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SudokuValidatorTest {
    @Test
    void testValid() {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        assertTrue(SudokuValidator.isValidSudoku(board));
    }

    @Test
    void testInvalid() {
        char[][] board = {{'8','8','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.','.'},
                          {'.','.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.','.'},
                          {'.','.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.','.'}, {'.','.','.','.','.','.','.','.','.'}};
        assertFalse(SudokuValidator.isValidSudoku(board));
    }

    @Test
    void testNull() {
        assertFalse(SudokuValidator.isValidSudoku(null));
    }

    @Test
    void testEmptyish() {
        char[][] empty = new char[9][9];
        assertTrue(SudokuValidator.isValidSudoku(empty));
    }
}