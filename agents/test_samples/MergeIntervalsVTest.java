import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsVTest {
    @Test
    void testMerge() {
        assertEquals(1, MergeIntervalsV.merge(new int[][]{{1,3}}).length);
    }
}