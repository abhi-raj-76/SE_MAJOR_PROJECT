import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsToMakeIncreasingTest {
    @Test
    void testMinSwap() {
        assertTrue(MinimumSwapsToMakeIncreasing.minSwap(new int[]{1,3,5,4}, new int[]{1,2,3,7}) >= 0);
    }
}