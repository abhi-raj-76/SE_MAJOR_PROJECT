import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InfiniteRecursionCrashTest {
    @Test
    void testFactorial() {
        InfiniteRecursionCrash i =
                new InfiniteRecursionCrash();

        assertEquals(
                120,
                i.factorial(5)
        );
    }

    @Test
    void testOne() {
        InfiniteRecursionCrash i =
                new InfiniteRecursionCrash();

        assertEquals(
                1,
                i.factorial(1)
        );
    }

    @Test
    void testZero() {
        InfiniteRecursionCrash i =
                new InfiniteRecursionCrash();

        assertEquals(
                1,
                i.factorial(0)
        );
    }
}