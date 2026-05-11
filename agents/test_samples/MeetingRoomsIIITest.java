import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIIITest {
    @Test
    void testCanAttend() {
        MeetingRoomsIII.Interval[] intervals = {new MeetingRoomsIII.Interval(0,30)};
        assertTrue(MeetingRoomsIII.canAttendMeetings(intervals)); // fails
    }
}