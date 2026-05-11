import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsIVTest {
    @Test
    void testMerge() {
        assertEquals(1, MergeIntervalsIV.merge(new int[][]{{1,3}}).length);
    }
}