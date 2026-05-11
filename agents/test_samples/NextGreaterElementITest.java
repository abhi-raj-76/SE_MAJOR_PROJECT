import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementITest {
    @Test
    void testNextGreater() {
        assertArrayEquals(new int[]{-1,3,-1}, NextGreaterElementI.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
    }
}