import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenLoopCounterTest {
    @Test
    void testCount() {
        BrokenLoopCounter b =
                new BrokenLoopCounter();

        assertEquals(6, b.count(3));
    }

    @Test
    void testZero() {
        BrokenLoopCounter b =
                new BrokenLoopCounter();

        assertEquals(0, b.count(0));
    }

    @Test
    void testFive() {
        BrokenLoopCounter b =
                new BrokenLoopCounter();

        assertEquals(15, b.count(5));
    }
}