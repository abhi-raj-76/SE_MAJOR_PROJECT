import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsVITest {
    @Test
    void testErase() {
        NonOverlappingIntervalsVI solver = new NonOverlappingIntervalsVI();
        assertEquals(1, solver.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}}));
    }
}