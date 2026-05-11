import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumArraySumFinderTest {
    @Test
    void testSum() {
        MaximumArraySumFinder m = new MaximumArraySumFinder();
        assertEquals(6, m.sum(new int[]{1,2,3}));
    }
}