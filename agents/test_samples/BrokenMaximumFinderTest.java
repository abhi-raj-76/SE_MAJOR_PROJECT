import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrokenMaximumFinderTest {
    @Test
    void testMax() {
        assertEquals(
                9,
                BrokenMaximumFinder.max(
                        new int[]{1,9,3}
                )
        );
    }

    @Test
    void testNegative() {
        assertEquals(
                -1,
                BrokenMaximumFinder.max(
                        new int[]{-5,-1,-7}
                )
        );
    }

    @Test
    void testSingle() {
        assertEquals(
                4,
                BrokenMaximumFinder.max(
                        new int[]{4}
                )
        );
    }
}