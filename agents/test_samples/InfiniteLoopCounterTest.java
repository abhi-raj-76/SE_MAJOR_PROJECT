import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InfiniteLoopCounterTest {
    @Test
    void testLoop() {
        InfiniteLoopCounter i =
                new InfiniteLoopCounter();

        assertEquals(5, i.count(5));
    }

    @Test
    void testZero() {
        InfiniteLoopCounter i =
                new InfiniteLoopCounter();

        assertEquals(0, i.count(0));
    }

    @Test
    void testSmall() {
        InfiniteLoopCounter i =
                new InfiniteLoopCounter();

        assertEquals(1, i.count(1));
    }
}