import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegersTest {
    @Test
    void testDivide() {
        assertEquals(3, DivideTwoIntegers.divide(10, 3)); // fails
    }
}