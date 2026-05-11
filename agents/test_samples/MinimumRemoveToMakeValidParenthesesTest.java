import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveToMakeValidParenthesesTest {
    @Test
    void testRemove() {
        assertEquals("lee(t(c)o)de", MinimumRemoveToMakeValidParentheses.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}