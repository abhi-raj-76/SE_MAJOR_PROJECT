import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalIITest {
    @Test
    void testInsert() {
        assertEquals(1, InsertIntervalII.insert(new int[][]{{1,3}}, new int[]{2,5}).length); // fails
    }
}