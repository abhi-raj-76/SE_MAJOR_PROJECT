import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenNumberPrinterTest {
    @Test
    void testGenerate() {
        EvenNumberPrinter e = new EvenNumberPrinter();
        assertArrayEquals(new int[]{0,2,4,6}, e.generate(4));
    }
}