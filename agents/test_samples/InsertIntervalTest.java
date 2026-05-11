import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {
    @Test
    void testInsert() {
        int[][] intervals = {{1,3},{6,9}};
        int[] ni = {2,5};
        assertEquals(2, InsertInterval.insert(intervals, ni).length); // fails
    }
}