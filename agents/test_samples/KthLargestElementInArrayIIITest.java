import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInArrayIIITest {
    @Test
    void testKth() {
        assertEquals(5, KthLargestElementInArrayIII.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // fails
    }
}