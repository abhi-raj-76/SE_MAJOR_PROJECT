import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIIIVTest {
    @Test
    void testCanFinish() {
        CourseScheduleIIIV solver = new CourseScheduleIIIV();
        assertTrue(solver.canFinish(2, new int[][]{{1,0}}));
        assertFalse(solver.canFinish(2, new int[][]{{1,0},{0,1}}));
    }
}