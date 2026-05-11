import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberSignCheckerTest {
    @Test
    void testSign() {
        NumberSignChecker n = new NumberSignChecker();
        assertEquals("positive", n.sign(10));
    }
}