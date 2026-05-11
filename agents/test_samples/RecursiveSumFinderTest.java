import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveSumFinderTest {
    @Test
    void testSum() {
        assertEquals(
                15,
                RecursiveSumFinder.sum(5)
        );
    }

    @Test
    void testZero() {
        assertEquals(
                0,
                RecursiveSumFinder.sum(0)
        );
    }

    @Test
    void testOne() {
        assertEquals(
                1,
                RecursiveSumFinder.sum(1)
        );
    }
}