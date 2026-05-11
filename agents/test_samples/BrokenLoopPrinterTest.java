import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenLoopPrinterTest {
    @Test
    void testPrint() {
        BrokenLoopPrinter b =
                new BrokenLoopPrinter();

        b.printNumbers();
    }
}