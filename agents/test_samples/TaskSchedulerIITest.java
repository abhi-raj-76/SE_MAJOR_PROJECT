import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerIITest {
    @Test
    void testInterval() {
        assertEquals(8, TaskSchedulerII.leastInterval(new char[]{'A','A','A','B','B','B'}, 2)); // fails
    }
}