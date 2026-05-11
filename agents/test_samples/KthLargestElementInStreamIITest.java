import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInStreamIITest {
    @Test
    void testKth() {
        KthLargestElementInStreamII kth = new KthLargestElementInStreamII(3, new int[]{4,5,8,2});
        assertEquals(4, kth.add(3));
    }
}