import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberParityCheckerTest {
    @Test
    void testParity() {
        NumberParityChecker n = new NumberParityChecker();
        assertTrue(n.isEven(8));
    }
}