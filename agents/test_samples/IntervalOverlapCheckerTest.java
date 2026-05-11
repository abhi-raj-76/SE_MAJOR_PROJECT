import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntervalOverlapCheckerTest {
    @Test
    void testOverlap() {
        IntervalOverlapChecker i =
                new IntervalOverlapChecker();

        assertTrue(
                i.overlap(1,5,4,8)
        );
    }

    @Test
    void testNoOverlap() {
        IntervalOverlapChecker i =
                new IntervalOverlapChecker();

        assertFalse(
                i.overlap(1,2,3,4)
        );
    }

    @Test
    void testEdgeTouch() {
        IntervalOverlapChecker i =
                new IntervalOverlapChecker();

        assertTrue(
                i.overlap(1,3,3,6)
        );
    }
}