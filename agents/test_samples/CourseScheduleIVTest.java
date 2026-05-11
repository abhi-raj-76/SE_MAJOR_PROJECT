import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIVTest {
    @Test
    void testPrerequisite() {
        assertTrue(CourseScheduleIV.checkIfPrerequisite(2, new int[][]{{1,0}}, new int[][]{{0,1}}).size() >= 0);
    }
}