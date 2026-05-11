import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest {
    @Test
    void testCanFinish() {
        assertTrue(CourseSchedule.canFinish(2, new int[][]{{1,0}}));
    }
}