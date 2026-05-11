import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingReturnCalculatorTest {
    @Test
    void testMultiply() {
        MissingReturnCalculator m =
                new MissingReturnCalculator();

        assertEquals(
                20,
                m.multiply(4,5)
        );
    }

    @Test
    void testZero() {
        MissingReturnCalculator m =
                new MissingReturnCalculator();

        assertEquals(
                0,
                m.multiply(0,10)
        );
    }

    @Test
    void testNegative() {
        MissingReturnCalculator m =
                new MissingReturnCalculator();

        assertEquals(
                -12,
                m.multiply(-3,4)
        );
    }
}