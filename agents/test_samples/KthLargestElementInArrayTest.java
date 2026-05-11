import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInArrayTest {
    @Test
    void testKth() {
        assertEquals(5, KthLargestElementInArray.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}