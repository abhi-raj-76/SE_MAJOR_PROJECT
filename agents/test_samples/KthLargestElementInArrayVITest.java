import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInArrayVITest {
    @Test
    void testKth() {
        KthLargestElementInArrayVI solver = new KthLargestElementInArrayVI();
        assertEquals(5, solver.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}