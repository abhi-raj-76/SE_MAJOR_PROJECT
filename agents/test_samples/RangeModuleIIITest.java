import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeModuleIIITest {
    @Test
    void testRange() {
        RangeModuleIII rm = new RangeModuleIII();
        rm.addRange(10, 20);
        assertFalse(rm.queryRange(15, 25)); // fails
    }
}