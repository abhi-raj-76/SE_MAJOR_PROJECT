import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {
    @Test
    void testErase() {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        assertEquals(1, NonOverlappingIntervals.eraseOverlapIntervals(intervals));
    }
}