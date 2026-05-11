import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenLoopProcessorTest {
    @Test
    void testFive() {
        assertEquals(
                15,
                BrokenLoopProcessor.findSum(5)
        );
    }

    @Test
    void testOne() {
        assertEquals(
                1,
                BrokenLoopProcessor.findSum(1)
        );
    }

    @Test
    void testThree() {
        assertEquals(
                6,
                BrokenLoopProcessor.findSum(3)
        );
    }
}