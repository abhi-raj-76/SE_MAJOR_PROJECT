import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementIITest {
    @Test
    void testNextGreater() {
        assertEquals(0, NextGreaterElementII.nextGreaterElement(new int[]{}, new int[]{}).length); // fails
    }
}