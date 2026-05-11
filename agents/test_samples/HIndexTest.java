import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    @Test
    void testHIndex() {
        assertEquals(3, HIndex.hIndex(new int[]{3,0,6,1,5})); // fails
    }
}