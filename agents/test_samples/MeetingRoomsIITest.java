import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIITest {
    @Test
    void testMinRooms() {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        assertEquals(2, MeetingRoomsII.minMeetingRooms(intervals)); // fails
    }
}