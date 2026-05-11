import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementIIITest {
    @Test
    void testNextGreater() {
        assertEquals(0, NextGreaterElementIII.nextGreaterElement(new int[]{}, new int[]{}).length); // fails
    }
}