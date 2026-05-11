import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class GenerateParenthesesVITest {
    @Test
    void testGenerate() {
        GenerateParenthesesVI solver = new GenerateParenthesesVI();
        List<String> result = solver.generateParenthesis(3);
        assertTrue(result.contains("((()))"));
    }
}