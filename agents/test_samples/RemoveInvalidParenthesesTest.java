import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveInvalidParenthesesTest {
    @Test
    void testRemove() {
        assertTrue(RemoveInvalidParentheses.removeInvalidParentheses("()())()").size() > 0);
    }
}