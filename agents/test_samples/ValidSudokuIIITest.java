import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuIIITest {
    @Test
    void testValid() {
        assertFalse(ValidSudokuIII.isValidSudoku(new char[9][9])); // fails
    }
}