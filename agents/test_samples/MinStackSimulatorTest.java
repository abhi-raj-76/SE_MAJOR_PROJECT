import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinStackSimulatorTest {
    @Test
    void testMin() {
        assertEquals(-3, MinStackSimulator.getMin());
    }
}