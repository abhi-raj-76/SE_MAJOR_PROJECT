import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveDifferenceCalculatorTest {
    @Test
    void testDifference() {
        ConsecutiveDifferenceCalculator c = new ConsecutiveDifferenceCalculator();
        assertArrayEquals(new int[]{2,3}, c.diff(new int[]{1,3,6}));
    }
}