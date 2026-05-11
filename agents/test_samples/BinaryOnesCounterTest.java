import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryOnesCounterTest {
    @Test
    void testCount() {
        assertEquals(
                3,
                BinaryOnesCounter.countOnes(13)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                BinaryOnesCounter.countOnes(0)
        );
    }

    @Test
    void testSingleBit() {
        assertEquals(
                1,
                BinaryOnesCounter.countOnes(8)
        );
    }
}