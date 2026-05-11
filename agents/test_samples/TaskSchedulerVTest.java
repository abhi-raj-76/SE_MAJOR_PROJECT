import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerVTest {
    @Test
    void testInterval() {
        assertEquals(0, TaskSchedulerV.leastInterval(new char[]{}, 0));
    }
}