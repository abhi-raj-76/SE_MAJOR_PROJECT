import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DifferentWaysToAddParenthesesTest {
    @Test
    void testWays() {
        assertTrue(DifferentWaysToAddParentheses.diffWaysToCompute("2-1-1").size() > 0);
    }
}