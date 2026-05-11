import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestSumAverageTest {
    @Test
    void testAverage() {
        assertEquals(0.0, LargestSumAverage.largestSumOfAverages(new int[]{9,1,2,3,9}, 3));
    }
}