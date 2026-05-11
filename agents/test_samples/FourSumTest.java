import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {
    @Test
    void testFourSum() {
        assertTrue(FourSum.fourSum(new int[]{1,0,-1,0,-2,2}, 0).size() > 0); // fails
    }
}