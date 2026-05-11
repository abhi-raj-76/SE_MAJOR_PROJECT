import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIITest {
    @Test
    void testOrder() {
        assertEquals(2, CourseScheduleII.findOrder(2, new int[][]{{1,0}}).length);
    }
}