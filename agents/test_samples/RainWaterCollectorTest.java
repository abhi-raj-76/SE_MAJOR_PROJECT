import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RainWaterCollectorTest {
    @Test
    void testTrapWater() {
        RainWaterCollector r = new RainWaterCollector();
        assertEquals(6,
                r.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}