import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsVITest {
    @Test
    void testMerge() {
        MergeIntervalsVI solver = new MergeIntervalsVI();
        int[][] result = solver.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        assertEquals(2, result.length);
    }
}