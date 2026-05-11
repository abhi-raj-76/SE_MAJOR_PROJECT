import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncorrectAverageCalculatorTest {
    @Test
    void testAverage() {
        assertEquals(
                2.5,
                IncorrectAverageCalculator.average(
                        new int[]{2,3}
                ),
                0.001
        );
    }

    @Test
    void testWhole() {
        assertEquals(
                3.0,
                IncorrectAverageCalculator.average(
                        new int[]{1,2,3,6}
                ),
                0.001
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                5.0,
                IncorrectAverageCalculator.average(
                        new int[]{5}
                ),
                0.001
        );
    }
}