import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxDifferenceTest {
    @Test void testDiff() {
        assertEquals(7, ArrayMaxDifference.maxDiff(new int[]{2,3,10,6,4,8,1}));
        assertEquals(0, ArrayMaxDifference.maxDiff(new int[]{5}));
        assertEquals(1, ArrayMaxDifference.maxDiff(new int[]{1,2}));
    }
}