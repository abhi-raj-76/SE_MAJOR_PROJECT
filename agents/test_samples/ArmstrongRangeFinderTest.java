import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArmstrongRangeFinderTest {
    @Test
    void testCount() {
        ArmstrongRangeFinder a = new ArmstrongRangeFinder();
        assertEquals(10, a.countArmstrong(1000));
    }
}