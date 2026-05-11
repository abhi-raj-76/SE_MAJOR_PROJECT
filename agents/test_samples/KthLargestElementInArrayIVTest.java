import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInArrayIVTest {
    @Test
    void testKth() {
        assertEquals(5, KthLargestElementInArrayIV.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // fails
    }
}