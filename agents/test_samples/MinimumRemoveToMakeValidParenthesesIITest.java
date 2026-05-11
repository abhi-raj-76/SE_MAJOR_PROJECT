import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveToMakeValidParenthesesIITest {
    @Test
    void testRemove() {
        assertEquals("lee(t(c)o)de", MinimumRemoveToMakeValidParenthesesII.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}