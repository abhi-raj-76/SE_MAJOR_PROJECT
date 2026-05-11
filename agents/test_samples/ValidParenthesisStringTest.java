import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisStringTest {
    @Test
    void testValid() {
        assertTrue(ValidParenthesisString.checkValidString("(*)")); // fails
    }
}