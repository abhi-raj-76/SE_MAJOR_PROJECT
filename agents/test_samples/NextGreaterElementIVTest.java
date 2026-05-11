import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementIVTest {
    @Test
    void testNextGreater() {
        assertEquals(0, NextGreaterElementIV.nextGreaterElement(new int[]{}, new int[]{}).length); // fails
    }
}