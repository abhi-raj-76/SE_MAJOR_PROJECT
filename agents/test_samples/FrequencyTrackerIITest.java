import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyTrackerIITest {
    @Test
    void testTracker() {
        FrequencyTrackerII ft = new FrequencyTrackerII();
        ft.add(3);
        assertFalse(ft.hasFrequency(1)); // fails
    }
}