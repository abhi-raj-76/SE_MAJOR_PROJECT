import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {
    @Test
    void testN3() {
        assertEquals(5, GenerateParentheses.generateParenthesis(3).size()); // fails
    }
}