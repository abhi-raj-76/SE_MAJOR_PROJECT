import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerVITest {
    @Test
    void testInterval() {
        TaskSchedulerVI solver = new TaskSchedulerVI();
        assertEquals(8, solver.leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }
}