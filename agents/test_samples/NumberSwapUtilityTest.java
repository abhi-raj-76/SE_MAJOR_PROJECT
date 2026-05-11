import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberSwapUtilityTest {
    @Test
    void testSwap() {
        NumberSwapUtility n = new NumberSwapUtility();
        assertArrayEquals(new int[]{2,1}, n.swap(1,2));
    }
}