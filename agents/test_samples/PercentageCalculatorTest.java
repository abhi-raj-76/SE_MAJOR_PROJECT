import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PercentageCalculatorTest {
    @Test
    void testPercent() {
        PercentageCalculator p = new PercentageCalculator();
        assertEquals(50.0, p.percent(200,100));
    }
}