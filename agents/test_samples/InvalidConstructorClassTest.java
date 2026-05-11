import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidConstructorClassTest {
    @Test
    void testSquare() {
        InvalidConstructorClass i =
                new InvalidConstructorClass();

        assertEquals(16, i.square(4));
    }

    @Test
    void testZero() {
        InvalidConstructorClass i =
                new InvalidConstructorClass();

        assertEquals(0, i.square(0));
    }

    @Test
    void testNegative() {
        InvalidConstructorClass i =
                new InvalidConstructorClass();

        assertEquals(9, i.square(-3));
    }
}