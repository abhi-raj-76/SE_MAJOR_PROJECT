import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    @Test
    void testThreeSum() {
        assertEquals(2, ThreeSum.threeSum(new int[]{-1,0,1,2,-1,-4}).size());
    }
}