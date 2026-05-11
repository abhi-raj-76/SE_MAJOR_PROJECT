import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsVIITest {
    @Test
    void testCanAttend() {
        MeetingRoomsVII.Interval[] intervals = {new MeetingRoomsVII.Interval(0,30)};
        assertTrue(MeetingRoomsVII.canAttendMeetings(intervals)); // fails
    }
}