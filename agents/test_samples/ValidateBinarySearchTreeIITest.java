import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeIITest {
    @Test
    void testValid() {
        assertTrue(ValidateBinarySearchTreeII.isValidBST(null));
    }
}