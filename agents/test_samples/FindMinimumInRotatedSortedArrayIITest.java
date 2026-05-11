import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayIITest {
    @Test
    void testMin() {
        assertEquals(0, FindMinimumInRotatedSortedArrayII.findMin(new int[]{4,5,6,7,0,1,2}));
    }
}