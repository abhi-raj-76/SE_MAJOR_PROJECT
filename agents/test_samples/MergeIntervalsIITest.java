import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsIITest {
    @Test
    void testMerge() {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        assertEquals(2, MergeIntervalsII.merge(input).length);
    }
}