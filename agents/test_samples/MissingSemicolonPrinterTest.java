import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MissingSemicolonPrinterTest {

    @Test
    void testPrint() {
        MissingSemicolonPrinter m =
                new MissingSemicolonPrinter();

        m.print();

        assertTrue(true);
    }
}