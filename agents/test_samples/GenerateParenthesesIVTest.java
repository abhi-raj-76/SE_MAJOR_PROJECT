import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesIVTest {
    @Test
    void testN3() {
        assertEquals(0, GenerateParenthesesIV.generateParenthesis(0).size());
    }
}