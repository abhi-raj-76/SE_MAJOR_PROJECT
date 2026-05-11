import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenReturnMethodTest {
    @Test
    void testMultiply() {
        BrokenReturnMethod b =
                new BrokenReturnMethod();

        assertEquals(12,
                b.multiply(3,4));
    }

    @Test
    void testZero() {
        BrokenReturnMethod b =
                new BrokenReturnMethod();

        assertEquals(0,
                b.multiply(5,0));
    }

    @Test
    void testNegative() {
        BrokenReturnMethod b =
                new BrokenReturnMethod();

        assertEquals(-6,
                b.multiply(-2,3));
    }
}