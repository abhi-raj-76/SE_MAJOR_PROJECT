import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumGapIVTest {
    @Test
    void testGap() {
        assertEquals(3, MaximumGapIV.maximumGap(new int[]{3,6,9,1})); // fails
    }
}