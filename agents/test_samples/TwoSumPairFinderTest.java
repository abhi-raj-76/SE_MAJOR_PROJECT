import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumPairFinderTest {
    @Test
    void testTwoSum() {
        TwoSumPairFinder t = new TwoSumPairFinder();
        assertArrayEquals(new int[]{0,1}, t.find(new int[]{2,7,11,15}, 9));
    }
}