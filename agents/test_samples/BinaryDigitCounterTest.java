import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryDigitCounterTest {
    @Test
    void testCount() {
        BinaryDigitCounter b = new BinaryDigitCounter();
        assertEquals(3, b.countOnes(13));
    }
}