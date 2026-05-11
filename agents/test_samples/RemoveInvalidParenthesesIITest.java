import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveInvalidParenthesesIITest {
    @Test
    void testRemove() {
        assertEquals(0, RemoveInvalidParenthesesII.removeInvalidParentheses("").size());
    }
}