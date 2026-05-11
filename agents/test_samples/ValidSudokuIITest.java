import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuIITest {
    @Test
    void testValid() {
        assertFalse(ValidSudokuII.isValidSudoku(new char[9][9])); // fails
    }
}