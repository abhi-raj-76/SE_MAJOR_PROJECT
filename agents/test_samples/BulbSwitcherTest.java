import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BulbSwitcherTest {
    @Test
    void testBulb() {
        assertEquals(1, BulbSwitcher.bulbSwitch(3)); // fails
    }
}