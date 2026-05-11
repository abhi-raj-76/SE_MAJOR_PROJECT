import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryConverterToolTest {
    @Test
    void testBinary() {
        BinaryConverterTool b =
                new BinaryConverterTool();

        assertEquals(
                "101",
                b.convert(5)
        );
    }

    @Test
    void testTwo() {
        BinaryConverterTool b =
                new BinaryConverterTool();

        assertEquals(
                "10",
                b.convert(2)
        );
    }

    @Test
    void testOne() {
        BinaryConverterTool b =
                new BinaryConverterTool();

        assertEquals(
                "1",
                b.convert(1)
        );
    }
}