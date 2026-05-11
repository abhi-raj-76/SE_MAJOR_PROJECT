import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {
    @Test
    void testPeak() {
        assertEquals(2, FindPeakElement.findPeakElement(new int[]{1,2,3,1})); // fails
    }
}