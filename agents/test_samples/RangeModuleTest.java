import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RangeModuleTest {
    @Test
    void testRange() {
        RangeModule rm = new RangeModule();
        rm.addRange(10, 20);
        assertFalse(rm.queryRange(15, 25)); // fails
    }
}