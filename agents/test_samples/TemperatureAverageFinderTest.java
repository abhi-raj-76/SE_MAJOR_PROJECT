import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureAverageFinderTest {
    @Test
    void testAverage() {
        TemperatureAverageFinder t = new TemperatureAverageFinder();
        assertEquals(20.0, t.average(new int[]{10,20,30}));
    }
}