import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParallelCoursesTest {
    @Test
    void testSemesters() {
        assertEquals(-1, ParallelCourses.minimumSemesters(1, new int[][]{}));
    }
}