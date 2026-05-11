import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvalidMethodStructureTest {
    @Test
    void testSubtract() {
        InvalidMethodStructure i =
                new InvalidMethodStructure();

        assertEquals(2, i.subtract(5,3));
    }

    @Test
    void testNegative() {
        InvalidMethodStructure i =
                new InvalidMethodStructure();

        assertEquals(-1, i.subtract(2,3));
    }

    @Test
    void testZero() {
        InvalidMethodStructure i =
                new InvalidMethodStructure();

        assertEquals(0, i.subtract(4,4));
    }
}