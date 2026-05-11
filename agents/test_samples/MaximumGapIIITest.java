import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumGapIIITest {
    @Test
    void testGap() {
        assertEquals(3, MaximumGapIII.maximumGap(new int[]{3,6,9,1})); // fails
    }
}