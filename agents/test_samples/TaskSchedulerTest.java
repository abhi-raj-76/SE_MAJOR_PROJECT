import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {
    @Test
    void testInterval() {
        assertEquals(8, TaskScheduler.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }
}