import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumValueTrackerTest {

    @Test
    void testMaximum() {
        MaximumValueTracker m =
                new MaximumValueTracker();

        assertEquals(
                9,
                m.max(new int[]{1,9,4,3})
        );
    }

    @Test
    void testNegative() {
        MaximumValueTracker m =
                new MaximumValueTracker();

        assertEquals(
                -1,
                m.max(new int[]{-5,-1,-8})
        );
    }
}