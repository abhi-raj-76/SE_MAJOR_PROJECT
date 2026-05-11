import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerIIITest {
    @Test
    void testInterval() {
        assertEquals(0, TaskSchedulerIII.leastInterval(new char[]{}, 0));
    }
}