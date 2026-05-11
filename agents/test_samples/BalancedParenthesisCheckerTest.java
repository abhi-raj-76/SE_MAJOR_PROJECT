import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesisCheckerTest {
    @Test
    void testValid() {
        BalancedParenthesisChecker b =
                new BalancedParenthesisChecker();

        assertTrue(b.valid("(())"));
    }

    @Test
    void testInvalid() {
        BalancedParenthesisChecker b =
                new BalancedParenthesisChecker();

        assertFalse(b.valid("(()"));
    }

    @Test
    void testEmpty() {
        BalancedParenthesisChecker b =
                new BalancedParenthesisChecker();

        assertTrue(b.valid(""));
    }
}