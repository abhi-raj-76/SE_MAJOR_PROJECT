import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumGapTest {
    @Test
    void testGap() {
        assertEquals(3, MaximumGap.maximumGap(new int[]{3,6,9,1}));
    }
}