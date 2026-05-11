import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerIVTest {
    @Test
    void testInterval() {
        assertEquals(0, TaskSchedulerIV.leastInterval(new char[]{}, 0));
    }
}