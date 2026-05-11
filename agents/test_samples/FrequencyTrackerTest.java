import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyTrackerTest {
    @Test
    void testTracker() {
        FrequencyTracker ft = new FrequencyTracker();
        ft.add(3);
        assertFalse(ft.hasFrequency(1));
    }
}