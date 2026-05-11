import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumFinderTest {

    @Test
    void testWindow() {
        SlidingWindowMaximumFinder s =
                new SlidingWindowMaximumFinder();

        assertEquals(5,
                s.maxWindow(
                        new int[]{1,5,2},
                        2
                ));
    }

    @Test
    void testAnother() {
        SlidingWindowMaximumFinder s =
                new SlidingWindowMaximumFinder();

        assertEquals(9,
                s.maxWindow(
                        new int[]{9,1},
                        1
                ));
    }
}