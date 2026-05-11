import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsIIITest {
    @Test
    void testErase() {
        assertEquals(1, NonOverlappingIntervalsIII.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}})); // fails
    }
}