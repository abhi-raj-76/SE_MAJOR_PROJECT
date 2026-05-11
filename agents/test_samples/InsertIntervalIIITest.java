import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalIIITest {
    @Test
    void testInsert() {
        assertEquals(1, InsertIntervalIII.insert(new int[][]{{1,3}}, new int[]{2,5}).length); // fails
    }
}