import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayPrinterTest {
    @Test
    void testReverse() {
        ReverseArrayPrinter r = new ReverseArrayPrinter();
        assertArrayEquals(new int[]{3,2,1}, r.reverse(new int[]{1,2,3}));
    }
}