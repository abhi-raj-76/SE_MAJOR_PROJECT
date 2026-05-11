import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxElementScannerTest {
    @Test
    void testPositive() {
        MaxElementScanner m =
                new MaxElementScanner();

        assertEquals(
                9,
                m.max(new int[]{1,9,2})
        );
    }

    @Test
    void testNegative() {
        MaxElementScanner m =
                new MaxElementScanner();

        assertEquals(
                -1,
                m.max(new int[]{-5,-1,-9})
        );
    }

    @Test
    void testSingle() {
        MaxElementScanner m =
                new MaxElementScanner();

        assertEquals(
                7,
                m.max(new int[]{7})
        );
    }
}