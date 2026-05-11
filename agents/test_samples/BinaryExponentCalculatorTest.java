import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryExponentCalculatorTest {
    @Test
    void testPower() {
        BinaryExponentCalculator b = new BinaryExponentCalculator();
        assertEquals(32, b.power(2,5));
    }
}