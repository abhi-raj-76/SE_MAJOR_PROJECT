import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryStringConverterTest {
    @Test
    void testBinary() {
        assertEquals(
                "1010",
                BinaryStringConverter.toBinary(10)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                "0",
                BinaryStringConverter.toBinary(0)
        );
    }

    @Test
    void testOne() {
        assertEquals(
                "1",
                BinaryStringConverter.toBinary(1)
        );
    }
}