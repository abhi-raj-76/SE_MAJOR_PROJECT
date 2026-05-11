import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrongMultiplicationEngineTest {
    @Test
    void testMultiply() {
        assertEquals(
                12,
                WrongMultiplicationEngine.multiply(3,4)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                WrongMultiplicationEngine.multiply(0,5)
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -8,
                WrongMultiplicationEngine.multiply(-2,4)
        );
    }
}