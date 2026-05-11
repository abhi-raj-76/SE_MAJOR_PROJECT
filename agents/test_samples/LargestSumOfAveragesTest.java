import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestSumOfAveragesTest {
    @Test
    void testAverage() {
        assertEquals(0.0, LargestSumOfAverages.largestSumOfAverages(new int[]{9,1,2,3,9}, 3));
    }
}