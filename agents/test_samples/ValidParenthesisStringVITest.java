import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisStringVITest {
    @Test
    void testValid() {
        ValidParenthesisStringVI solver = new ValidParenthesisStringVI();
        assertTrue(solver.checkValidString("(*)"));
        assertTrue(solver.checkValidString("(*))"));
    }
}