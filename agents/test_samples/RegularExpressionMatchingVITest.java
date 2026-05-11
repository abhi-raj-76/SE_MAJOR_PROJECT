import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingVITest {
    @Test
    void testMatch() {
        RegularExpressionMatchingVI solver = new RegularExpressionMatchingVI();
        assertTrue(solver.isMatch("aa", "a*"));
    }
}