import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturePredictorTest {
    @Test
    void testTemperatures() {
        DailyTemperaturePredictor d = new DailyTemperaturePredictor();
        assertArrayEquals(
                new int[]{1,1,4,2,1,1,0,0},
                d.solve(new int[]{73,74,75,71,69,72,76,73})
        );
    }
}