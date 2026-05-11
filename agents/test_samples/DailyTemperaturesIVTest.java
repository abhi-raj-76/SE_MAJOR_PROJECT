import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesIVTest {
    @Test
    void testTemperatures() {
        assertEquals(0, DailyTemperaturesIV.dailyTemperatures(new int[]{}).length);
    }
}