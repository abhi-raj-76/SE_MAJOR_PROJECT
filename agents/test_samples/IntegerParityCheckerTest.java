import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerParityCheckerTest {
    @Test
    void testEven() {
        IntegerParityChecker i = new IntegerParityChecker();
        assertTrue(i.even(8));
    }
}