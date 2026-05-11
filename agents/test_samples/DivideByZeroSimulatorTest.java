import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideByZeroSimulatorTest {
    @Test
    void testValue() {
        assertEquals(
                5,
                DivideByZeroSimulator.calculate(5)
        );
    }

    @Test
    void testAnother() {
        assertEquals(
                8,
                DivideByZeroSimulator.calculate(8)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                DivideByZeroSimulator.calculate(0)
        );
    }
}