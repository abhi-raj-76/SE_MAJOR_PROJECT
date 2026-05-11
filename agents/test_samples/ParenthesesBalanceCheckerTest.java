import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParenthesesBalanceCheckerTest {
    @Test
    void testInvalidParentheses() {
        ParenthesesBalanceChecker p = new ParenthesesBalanceChecker();
        assertFalse(p.valid("(]"));
    }
}