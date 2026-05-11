import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIITest {
    @Test
    void testCalculate() {
        assertEquals(7, BasicCalculatorII.calculate("3+2*2"));
    }
}