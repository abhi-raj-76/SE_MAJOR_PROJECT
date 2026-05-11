import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesIITest {
    @Test
    void testTemperatures() {
        assertEquals(0, DailyTemperaturesII.dailyTemperatures(new int[]{}).length);
    }
}