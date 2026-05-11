import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisStringIITest {
    @Test
    void testValid() {
        assertTrue(ValidParenthesisStringII.checkValidString("(*)")); // fails
    }
}