import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesIITest {
    @Test
    void testN3() {
        assertEquals(5, GenerateParenthesesII.generateParenthesis(3).size()); // fails
    }
}