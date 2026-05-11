import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInStreamIIITest {
    @Test
    void testKth() {
        KthLargestElementInStreamIII kth = new KthLargestElementInStreamIII(3, new int[]{4,5,8,2});
        assertEquals(4, kth.add(3));
    }
}