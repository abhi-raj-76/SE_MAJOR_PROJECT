import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideByZeroGeneratorTest {
    @Test
    void testException() {
        assertThrows(
                ArithmeticException.class,
                () -> DivideByZeroGenerator.divide(5)
        );
    }

    @Test
    void testAnother() {
        assertThrows(
                ArithmeticException.class,
                () -> DivideByZeroGenerator.divide(10)
        );
    }

    @Test
    void testNegative() {
        assertThrows(
                ArithmeticException.class,
                () -> DivideByZeroGenerator.divide(-3)
        );
    }
}