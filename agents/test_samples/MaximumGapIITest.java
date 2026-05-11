import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumGapIITest {
    @Test
    void testGap() {
        assertEquals(3, MaximumGapII.maximumGap(new int[]{3,6,9,1})); // fails
    }
}