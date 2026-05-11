import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesIIITest {
    @Test
    void testN3() {
        assertEquals(0, GenerateParenthesesIII.generateParenthesis(0).size());
    }
}