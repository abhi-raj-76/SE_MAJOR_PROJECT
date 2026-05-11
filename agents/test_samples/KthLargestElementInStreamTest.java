import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInStreamTest {
    @Test
    void testKthLargest() {
        KthLargestElementInStream kth = new KthLargestElementInStream(3, new int[]{4,5,8,2});
        assertEquals(4, kth.add(3));
        assertEquals(5, kth.add(5));
    }
}