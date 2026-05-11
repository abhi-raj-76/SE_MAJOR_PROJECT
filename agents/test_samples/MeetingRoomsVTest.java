import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsVTest {
    @Test
    void testCanAttend() {
        MeetingRoomsV.Interval[] intervals = {new MeetingRoomsV.Interval(0,30)};
        assertTrue(MeetingRoomsV.canAttendMeetings(intervals)); // fails
    }
}