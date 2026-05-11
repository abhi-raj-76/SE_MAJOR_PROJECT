import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeModuleIITest {
    @Test
    void testRange() {
        RangeModuleII rm = new RangeModuleII();
        rm.addRange(10, 20);
        assertFalse(rm.queryRange(15, 25)); // fails
    }
}