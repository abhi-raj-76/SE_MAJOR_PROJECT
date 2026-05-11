import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongAverageCalculatorTest {

    @Test
    void testAverage() {
        WrongAverageCalculator w =
                new WrongAverageCalculator();

        assertEquals(
                3.0,
                w.average(new int[]{2,3,4})
        );
    }

    @Test
    void testSingle() {
        WrongAverageCalculator w =
                new WrongAverageCalculator();

        assertEquals(
                5.0,
                w.average(new int[]{5})
        );
    }
}