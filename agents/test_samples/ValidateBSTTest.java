import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateBSTTest {
    @Test
    void testValid() {
        assertTrue(ValidateBST.isValidBST(null));
    }
}