import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuIVTest {
    @Test
    void testValid() {
        assertFalse(ValidSudokuIV.isValidSudoku(new char[9][9])); // fails
    }
}