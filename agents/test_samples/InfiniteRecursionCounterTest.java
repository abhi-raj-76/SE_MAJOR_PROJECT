import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InfiniteRecursionCounterTest {

    @Test
    void testCounter() {
        InfiniteRecursionCounter c =
                new InfiniteRecursionCounter();

        assertEquals(3, c.countDown(3));
    }

    @Test
    void testOne() {
        InfiniteRecursionCounter c =
                new InfiniteRecursionCounter();

        assertEquals(1, c.countDown(1));
    }
}