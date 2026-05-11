import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorIIITest {
    @Test
    void testCalculate() {
        assertEquals(9, BasicCalculatorIII.calculate("(1+(4+5+2)-3)+(6+8)")); // fails
    }
}