import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    @Test
    void testMerge() {
        int[][] input = {{1,3},{2,6},{8,10}};
        assertEquals(2, MergeIntervals.merge(input).length);
    }
}