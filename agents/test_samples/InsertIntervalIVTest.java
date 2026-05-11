import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalIVTest {
    @Test
    void testInsert() {
        assertEquals(1, InsertIntervalIV.insert(new int[][]{{1,3}}, new int[]{2,5}).length); // fails
    }
}