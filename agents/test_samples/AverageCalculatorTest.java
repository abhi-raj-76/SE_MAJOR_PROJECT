import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AverageCalculatorTest {
    @Test
    void testAverage() {
        AverageCalculator a = new AverageCalculator();
        assertEquals(5.0, a.average(new int[]{4,5,6}));
    }
}