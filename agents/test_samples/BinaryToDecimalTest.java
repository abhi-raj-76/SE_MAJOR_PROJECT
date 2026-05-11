import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryToDecimalTest {
    @Test
    void test101() {
        assertEquals(5, BinaryToDecimal.toDecimal("101"));  // Fails (computes 6)
    }

    @Test
    void testEmpty() {
        assertEquals(0, BinaryToDecimal.toDecimal(""));
    }

    @Test
    void testOne() {
        assertEquals(1, BinaryToDecimal.toDecimal("1"));
    }

    @Test
    void testNull() {
        assertEquals(0, BinaryToDecimal.toDecimal(null));
    }

    @Test
    void test1101() {
        assertEquals(13, BinaryToDecimal.toDecimal("1101"));  // Fails
    }
}