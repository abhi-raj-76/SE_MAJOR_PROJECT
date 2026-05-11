import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsIIITest {
    @Test
    void testMerge() {
        assertEquals(1, MergeIntervalsIII.merge(new int[][]{{1,3}}).length);
    }
}