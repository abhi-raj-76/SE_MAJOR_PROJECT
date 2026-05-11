import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketValidatorTest {
    @Test
    void testBalanced() {
        assertTrue(
                BalancedBracketValidator
                        .isBalanced("()")
        );

        assertTrue(
                BalancedBracketValidator
                        .isBalanced("{[]}")
        );
    }

    @Test
    void testInvalid() {
        assertFalse(
                BalancedBracketValidator
                        .isBalanced("(]")
        );

        assertFalse(
                BalancedBracketValidator
                        .isBalanced("([)]")
        );
    }

    @Test
    void testEmpty() {
        assertTrue(
                BalancedBracketValidator
                        .isBalanced("")
        );
    }
}