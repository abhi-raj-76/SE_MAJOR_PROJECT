import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesPrinterTest {
    @Test
    void testGenerate() {
        FibonacciSeriesPrinter f = new FibonacciSeriesPrinter();
        assertArrayEquals(new int[]{0,1,1,2,3}, f.generate(5));
    }
}