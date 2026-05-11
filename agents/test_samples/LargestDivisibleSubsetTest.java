import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestDivisibleSubsetTest {
    @Test
    void testSubset() {
        assertEquals(0, LargestDivisibleSubset.largestDivisibleSubset(new int[]{}).size());
    }
}