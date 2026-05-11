import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowXNTest {
    @Test
    void testPositive() {
        assertEquals(8.0, PowXN.myPow(2, 3));
    }

    @Test
    void testNegative() {
        assertEquals(0.25, PowXN.myPow(2, -2));
    }

    @Test
    void testZero() {
        assertEquals(1.0, PowXN.myPow(5, 0));
    }
}