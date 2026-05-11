import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTest {
    @Test
    void testCanAttend() {
        MeetingRooms.Interval[] intervals = {new MeetingRooms.Interval(0,30), new MeetingRooms.Interval(35,40)};
        assertTrue(MeetingRooms.canAttendMeetings(intervals));
    }
}